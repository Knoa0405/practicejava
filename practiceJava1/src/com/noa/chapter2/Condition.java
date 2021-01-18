package com.noa.chapter2;

import java.util.Scanner;

public class Condition {
	void login () {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("### 아이디를 입력하세요 ! : ");
		String username = scan.next();
		
		System.out.print("# 비밀번호를 입력하세요 : ");
		String password = scan.next();
		
		if(username.equals("hong") && password.equals("1234")) {
			System.out.println("인증확인! => 로그인 성공");
		}
		else {
			System.out.println("아이디나 비밀번호를 틀렸습니다.");
			
		}
	}
	
	void check() {
		int cnt = 10;
		String msg = cnt > 0 ? "새로운 쪽지가 있습니다" : "새로운 쪽지가 없습니다";
		System.out.println(msg);
	}
	public static void main(String[] args) {
		Condition con = new Condition();
		
		while (true) {
			System.out.printf("# 메누를 선택하세요 (1:로그인, 2: 쪽지확인 ,3:종료 ) ==> ");
			Scanner scan = new Scanner(System.in);
			String sel = scan.next();
			
			switch(sel) {
			case "1" : con.login();break;
			case "2" : con.check();break;
			case "x" : System.exit(0);
			default : System.out.println("잘못된 입력입니다!!");
			}
		}
		
	}
}
