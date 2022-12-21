package com.sh.git;

/**
 * 되돌리기 
 *  - revert : 지정한 커밋에 작업내용을 취소한 버전을 새로운 커밋으로 만든다.(conflict 날 수 있음.)//현재에 있으면서 과거의 특정 사건(commit)들만 없던 일로 만든다.
 *  
 *  - reset : 지정한 커밋으로 돌아간다.시간을 아예 과거의 특정 사건(commit)으로 되돌린다.
 *  선택할 수 있는 옵션   1. hard : 지정 커밋 이후의 변경사항 버림
 *                   2. mixed : 지정 커밋 이후 변경사항을 unstaging area에 보관. 재추가 후 커밋 가능.
 *                   3. soft : 지정 커밋 이후 변경사항을 staging area에 보관. 즉시 커밋 가능
 *
 *
 */
public class Main {
	
	public void master() {
		
	}

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("Hello git");
	}

	public void feature() {
		
	}
}
