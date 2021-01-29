package com.java.bak4;
//maven 으로 github api 가져옴.
import org.kohsuke.github.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LiveStudy {
	// String token 
	static Token gitHubToken = new Token();
	
	private final static String token = gitHubToken.getToken();

	private GitHub github;
	
	public static void main(String[] args) {
		LiveStudy app = new LiveStudy();
		
		try {
			app.run();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private void run() throws IOException {
		// 연결
		connectGitApi();
		
		GHRepository ghRepository = github.getRepository("whiteship/live-study");
		// 참여자 이름, 참여 횟수
		Map<String, Integer> participant = new HashMap<>();
		// 모든 이슈를 가져온다
		List<GHIssue> issues = ghRepository.getIssues(GHIssueState.ALL);
		
		for(GHIssue issue : issues) {
			List<GHIssueComment> commentList = issue.getComments();
			
			Set<String> nameList = new HashSet<>();
			
			addParticipantInSet(commentList, nameList);
			
            // 참여자 명단에서 비교한다.
            for (String s : nameList) {
                hasParticipantInSet(participant, s);
            }
			
			printParticipantRate(participant);
		}
	}
	
    private void hasParticipantInSet(Map<String, Integer> participant, String s) {
        if (!participant.containsKey(s)) {
            participant.put(s, 1);
        } else {
            Integer integer = participant.get(s);
            participant.put(s, ++integer);
        }
    }

    private void addParticipantInSet(List<GHIssueComment> commentList, Set<String> name) throws IOException {
        for (GHIssueComment ghIssueComment : commentList) {
            name.add(ghIssueComment.getUser().getLogin());
        }
    }

    private void printParticipantRate(Map<String, Integer> participant) {
    	System.out.println(participant);
    	
        participant.forEach((key, value) -> {
            double percent = (double) (value * 100) / 18;
            System.out.println(key + "  :  "+String.format("%.2f", percent)+ "%");
        });
    }

	private void connectGitApi() throws IOException {
		github = new GitHubBuilder().withOAuthToken(token).build();
	}

}
