package com.java.bak;
//maven 으로 github api 가져옴.
import org.kohsuke.github.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
		// 참여자 이름, 참여 횟수
		GHRepository ghRepository = github.getRepository("whiteship/live-study");
		// 모든 이슈를 가져온다
		Map<String, Integer> participant = new HashMap<>();
		System.out.println(participant);
	}
	
	private void connectGitApi() throws IOException {
		github = new GitHubBuilder().withOAuthToken(token).build();
	}

}
