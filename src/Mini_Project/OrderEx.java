package Mini_Project;

import java.util.Scanner;

public class OrderEx {

    static Scanner scanner = new Scanner(System.in);
     static Burger[] burgers = new Burger[] {
            new BulgogiBurger("불고기버거", 7000),
            new CheeseBurger("치즈버거", 6000),
            new ShrimpBurger("새우버거", 7500),
     };
            

    public static void main(String[] args) {
        System.out.println("환영합니다! *^^*\nSol's Hamburger입니다."
        				+ "\n원하시는 메뉴를 선택해주십시오.");
        System.out.println("===============================");
        System.out.println("1. 메뉴보기 | 2. 주문하기 | 3.주문완료");
        System.out.println("===============================");
        System.out.println("선택 -> ");
        boolean run = true;
        while (run) {
            int selectnum = scanner.nextInt();
            if (selectnum == 1) {
                getMenu();
                System.out.println("------------------------------------------");
                System.out.println("주문을 원하시면 2번을 눌러주십시오.");
                System.out.println("선택 -> ");
            } else if (selectnum == 2) {
            	System.out.println("------------------------------------------");
            	System.out.println("주문하실 햄버거의 번호를 입력해주세요.");
            	System.out.println("선택 -> ");
                int setnum = scanner.nextInt();
                if (setnum == 1) {
                	System.out.println("------------------------------------------");
                	System.out.println("세트메뉴를 추가하시겠습니까?\n"
                					+ "1500원을 추가하시면 감자튀김과 콜라가 무제한으로 제공됩니다.");
                	System.out.println("1. 세트메뉴 추가 | 2. 추가 안함");
                	System.out.println("------------------------------------------");
                	addSet();
                } else if (setnum == 2) {
                	noneSet();
                } else {
                	System.out.println("잘못 입력하였습니다.\n"
            				+ "1,2번 중에 다시 입력해 주세요.");
                }
            } else if (selectnum == 3) {
                System.out.println("주문 완료!");
                break;
            } else {
                System.out.println("잘못 입력하였습니다.\n"
                				+ "1,2,3번 중에 다시 입력해 주세요.");
            }
        }

        System.out.println("프로그램이 종료되었습니다. 다음 고객님 이용 부탁드립니다.\n"
        				+ "오늘도 행복한 하루 보내십시오<3");
    }
    //메인 닫힘
    
    //햄버거 목록 불러오기
    private static void getMenu() {
        System.out.println("------------------------------------------");
        System.out.println("<메뉴>");
        for (int i = 0; i < burgers.length; i++) {
            System.out.println(i + 1 + ". " + burgers[i].getName() + ": " + burgers[i].getPrice() + "원");
        }
    }

    private static void addSet() {
    	for (int i = 0; i < burgers.length; i++) {
    		//System.out.println( burgers[3].getName() + "는 " + burgers[3].getPrice() + "원 입니다." );
    		break;
    	}
    }
    
    private static void orderHamburger() {
        int orderNumber = scanner.nextInt() - 1;
        Burger burger = burgers[orderNumber];
        System.out.println("------------------------------------------");
        System.out.println("주문한 햄버거는 " + burger.getName() + " 이며," +
                " 가격은 " + burger.getPrice() + "원 입니다. ");
        System.out.println(burger.getName() + "는 " + burger.explain());
    }
    
    private static void noneSet() {
    	
    }
    
    
    
    
}