package java_question.ch01;

import java.util.Scanner;

public class dsd {

	public static void a() {
		Scanner sc = new Scanner(System.in);
		System.out.println("번호를 입력하세요: ");
		int num =sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("1번이 입력되엇습니다");
			break;

		case 2:
			System.out.println("2번이 입력되엇습니다");
		default:
			break;
		} 
	}
}
