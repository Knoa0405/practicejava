package com.noa.chapter2;

public class Loop {
	public static void main(String[] args) {
		int power = 13;
		String members[] = {"ȫ�浿","��浿","����","�ƹ���"};
		
		for(int i = 1; i<10; i++) {
			System.out.println(i);
		}
		
		for(int i = 0; i < members.length; i++) {
			System.out.println(members[i]);
		}
		
		for(String name : members) {
			System.out.println(name);
		}
		
		while(power > 10) {
			System.out.println("go");
			power--;
		}
		System.out.println("stop");
	}
}
