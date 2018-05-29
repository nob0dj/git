package com.kh.git;

public class HelloGit {

	public static void main(String[] args) {
		//파일을 생성하면 파일이 속한 트리구조 전체에 물음표가 생기며,
		//not tracing(추적중 아님)을 의미함.
		System.out.println("Hello Git!");
		
		//branchTest
		//프로젝트 루트에서 우클릭, 
		//Team-SwitchTo [new branch]에서 branchTest입력후, checkout함.
		//checkout : 선택한 브랜치로 작업이동
		System.out.println("new branch : branchTest");
		System.out.println("added From master!!");
		System.out.println("add from branchTest");
		//원격저장소 push후
		System.out.println("message from master!");
		
		System.out.println("imac테스");

	}
	
	public void test(){
		System.out.println("branchTest : test메소드생성!!");
		System.out.println(".gitignore not working!!");
		System.out.println(".gitignore not working2!!");
		System.out.println(".gitignore not working3!!");

	}

}
