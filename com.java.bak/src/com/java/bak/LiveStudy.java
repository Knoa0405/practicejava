package com.java.bak;
//maven ���� github api ������.
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
		// ����
		connectGitApi();
		// ������ �̸�, ���� Ƚ��
		GHRepository ghRepository = github.getRepository("whiteship/live-study");
		// ��� �̽��� �����´�
		Map<String, Integer> participant = new HashMap<>();
		System.out.println(participant);
	}
	
	private void connectGitApi() throws IOException {
		github = new GitHubBuilder().withOAuthToken(token).build();
	}

}
