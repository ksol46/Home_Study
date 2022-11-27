package Mini_Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
	static Scanner scanner = new Scanner(System.in);
	
	public static ArrayList<Hamburger> BurgerArray = new ArrayList<Hamburger>();
	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("안녕하세요*^^*\nSol's Hamburger입니다.\n원하시는 메뉴를 선택해주십시오.");
			System.out.println("===============================");
			System.out.println("1. 주문하기 | 2. 주문내역 확인 | 3.종료");
			System.out.println("===============================");
			System.out.println("선택 -> ");
			
			int num = scanner.nextInt();
			
			if (num == 1) Order();
			else if (num == 2) OrderList();
			else if (num == 3) run = false;
		}
	
		System.out.println("프로그램이 종료되었습니다. 다음 고객님 이용 부탁드립니다.");
		
		
	}

	//1. 주문
	
	//생성자
	public static void Order() {
		System.out.println("-------");
		System.out.println(" 주문하기 ");
		System.out.println("-------");
		
		System.out.println("주문하시는 고객님의 성함과 번호 뒷자리 4개를 입력해주세요.");
		System.out.println("입력 -> ");
		String Ordernumber = scanner.next();
		
		System.out.println("-------------------------------------");
		System.out.println("주문하실 메뉴를 숫자로 입력해주세요.");
		System.out.println("1.불고기버거  | 2. 치즈버거"
						+" 3. 콜라 추가 +500원 | 4. 모두 추가 +1500원 ");
		System.out.println("-------------------------------------");
		int menuNum = scanner.nextInt();
		
		int menuPrice = 0;
		if(menuNum == 1) {
		//생성자
			public Hamburger hamburger = new Hamburger();
			system.out.println("세트메뉴를 추가 하시겠습니까?");
			int setnum = scanner.nextInt();
			hamburger.set(setnum);
			int setnum = scanner.nextInt();
			hamburger.addPrice(hamburger.set);
			system.out.println("");
				
		
		} else if (menuNum == 2) {
			System.out.println("감자튀김을 추가합니다. 추가금액 1000원");
			select =  "감자튀김 추가";
			menuPrice = 8000;
		} else if (menuNum == 3) {
			System.out.println("콜라를 추가합니다. 추가금액 500원");
			select =  "콜라 추가";
			menuPrice = 7500;
		} else if (menuNum == 4)
			System.out.println("모두 추가합니다. 추가금액 1500원");
			select =  "모두 추가";
			menuPrice = 8500;
		} else {
			continue;
		}
		
		


		//2. 주문내역 확인
	public static void OrderList() {
		
		System.out.println("--------");
		System.out.println(" 주문 내역 ");
		System.out.println("--------");
	}
		//3. 프로그램 종료
	
		

	
	}
