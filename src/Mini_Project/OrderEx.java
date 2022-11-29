package Mini_Project;

import java.util.Scanner;

public class OrderEx {

    static Scanner scanner = new Scanner(System.in);
     static Burger[] burgers = new Burger[] {
            new BulgogiBurger("불고기버거", 7000),
            new CheeseBurger("치즈버거", 6000),
            new ShrimpBurger("새우버거", 7500),
     };
     static SideMenu[] sidemenus = new SideMenu[] {
    		 new FrenchFries("감자튀김", 1000),
    		 new CheeseStick("치즈스틱", 1000),
    		 new Coleslaw("코울슬로", 1000),
    		 new Coke("콜라", 800),
    		 new Cider("사이다", 800),
    		 new Water("물", 600),
    		 new SideMenu("사이드메뉴 추가안함", 0),
     };

    public static void main(String[] args) {
        System.out.println("환영합니다!\n솔이네버거 입니다."
        				+ "\n원하시는 메뉴를 입력해주세요.");
        System.out.println("===========================================");
        System.out.println(" 1. 메뉴보기 | 2. 주문하기 | 3. 주문완료 | 4.종료하기 ");
        System.out.println("===========================================");
        System.out.println("선택 -> ");
        boolean run = true;
        while (run) {
            int selectnum = scanner.nextInt();
            if (selectnum == 1) {
                getMenu();
                System.out.println("------------------------------------------");
                System.out.println("주문을 원하시면 2번을 입력 해주세요.");
                System.out.println("선택 -> ");
            } else if (selectnum == 2) {
            	System.out.println("------------------------------------------");
            	System.out.println("주문하실 햄버거의 번호를 입력 해주세요.");
            	System.out.println("선택 -> ");
                int burgernum = scanner.nextInt();
                if (burgernum == 1) {
                	System.out.println("------------------------------------------");
                	System.out.println("사이드 메뉴를 추가 하시겠습니까?");
                	System.out.println("원하시는 메뉴의 번호를 입력 해주세요.");
                	getSideMenu();
                	System.out.println(" ");
                	System.out.println("------------------------------------------");
                	System.out.println("선택 -> ");
                	int sidenum = scanner.nextInt();
                	if (sidenum == 1) {
                		System.out.println("주문완료 되었습니다. 3번을 눌러 주문확인을 해주세요.");
                		continue;
                	} else if (sidenum == 2) {
                		System.out.println("주문완료 되었습니다. 3번을 눌러 주문확인을 해주세요.");
                		continue;
                	} else if (sidenum == 3) {
                		System.out.println("주문완료 되었습니다. 3번을 눌러 주문확인을 해주세요.");
                		continue;
                	} else if (sidenum == 4) {
                		System.out.println("주문완료 되었습니다. 3번을 눌러 주문확인을 해주세요.");
                		continue;
                	} else if (sidenum == 5) {
                		System.out.println("주문완료 되었습니다. 3번을 눌러 주문확인을 해주세요.");
                		continue;
                	} else if (sidenum == 6) {
                		System.out.println("주문완료 되었습니다. 3번을 눌러 주문확인을 해주세요.");
                		continue;
                	} else if (sidenum == 7){
                		System.out.println("주문완료 되었습니다. 3번을 눌러 주문확인을 해주세요.");
                		continue;
                	}else {
                		System.out.println("------------------------------------------");
                		System.out.println("잘못 입력 하였습니다.\n"
                				+ "1~7번 중에 다시 입력 해주세요.");
                		System.out.println("선택 -> ");
                		//다시 앞으로 돌아가고 싶어요...
                	}
                } else if (burgernum == 2) {
                	System.out.println("------------------------------------------");
                	System.out.println("사이드 메뉴를 추가 하시겠습니까?");
                	System.out.println("원하시는 메뉴의 번호를 입력 해주세요.");
                	getSideMenu();
                	System.out.println(" ");
                	System.out.println("------------------------------------------");
                	System.out.println("선택 -> ");
                	int sidenum = scanner.nextInt();
                	if (sidenum == 1) {
                		System.out.println("주문완료 되었습니다. 3번을 눌러 주문확인을 해주세요.");
                		continue;
                	} else if (sidenum == 2) {
                		System.out.println("주문완료 되었습니다. 3번을 눌러 주문확인을 해주세요.");
                		continue;
                	} else if (sidenum == 3) {
                		System.out.println("주문완료 되었습니다. 3번을 눌러 주문확인을 해주세요.");
                		continue;
                	} else if (sidenum == 4) {
                		System.out.println("주문완료 되었습니다. 3번을 눌러 주문확인을 해주세요.");
                		continue;
                	} else if (sidenum == 5) {
                		System.out.println("주문완료 되었습니다. 3번을 눌러 주문확인을 해주세요.");
                		continue;
                	} else if (sidenum == 6) {
                		System.out.println("주문완료 되었습니다. 3번을 눌러 주문확인을 해주세요.");
                		continue;
                	} else if (sidenum == 7){
                		System.out.println("주문완료 되었습니다. 3번을 눌러 주문확인을 해주세요.");
                		continue;
                	}else {
                		System.out.println("------------------------------------------");
                		System.out.println("잘못 입력 하였습니다.\n"
                				+ "1~7번 중에 다시 입력 해주세요.");
                		System.out.println("선택 -> ");
                		//다시 앞으로 돌아가고 싶어요...
                	}
                } else if (burgernum == 3){
                	System.out.println("------------------------------------------");
                	System.out.println("사이드 메뉴를 추가 하시겠습니까?");
                	System.out.println("원하시는 메뉴의 번호를 입력 해주세요.");
                	getSideMenu();
                	System.out.println(" ");
                	System.out.println("------------------------------------------");
                	System.out.println("선택 -> ");
                	int sidenum = scanner.nextInt();
                	if (sidenum == 1) {
                		System.out.println("주문완료 되었습니다. 3번을 눌러 주문확인을 해주세요.");
                		continue;
                	} else if (sidenum == 2) {
                		System.out.println("주문완료 되었습니다. 3번을 눌러 주문확인을 해주세요.");
                		continue;
                	} else if (sidenum == 3) {
                		System.out.println("주문완료 되었습니다. 3번을 눌러 주문확인을 해주세요.");
                		continue;
                	} else if (sidenum == 4) {
                		System.out.println("주문완료 되었습니다. 3번을 눌러 주문확인을 해주세요.");
                		continue;
                	} else if (sidenum == 5) {
                		System.out.println("주문완료 되었습니다. 3번을 눌러 주문확인을 해주세요.");
                		continue;
                	} else if (sidenum == 6) {
                		System.out.println("주문완료 되었습니다. 3번을 눌러 주문확인을 해주세요.");
                		continue;
                	} else if (sidenum == 7){
                		System.out.println("주문완료 되었습니다. 3번을 눌러 주문확인을 해주세요.");
                		continue;
                	}else {
                		System.out.println("------------------------------------------");
                		System.out.println("잘못 입력 하였습니다.\n"
                				+ "1~7번 중에 다시 입력 해주세요.");
                		System.out.println("선택 -> ");
                		//다시 앞으로 돌아가고 싶어요...
                	}
                }
            } else if (selectnum == 3) {
            	System.out.println("------------------------------------------");
                System.out.println("주문이 완료 되었습니다.");
                System.out.println("고객님의 주문내역은");
                showOrderList();
                System.out.println("입니다. 잠시만 기다려주십시오.");
                break;
            } else {
                System.out.println("잘못 입력하였습니다.\n"
                				+ "1,2,3번 중에 다시 입력해 주세요.");
                break;
            }
            
            }
      
        System.out.println("프로그램이 종료되었습니다. 다음 고객님 이용 부탁드립니다.\n"
				+ "오늘도 평안한 하루 보내십시오<3");
    }

    //메인 닫힘
    
    //햄버거 목록 불러오기
    private static void getMenu() {
        System.out.println("------------------------------------------");
        System.out.println("<메뉴>");
        for (int i = 0; i < burgers.length; i++) {
            System.out.println(i + 1 + ". " + burgers[i].getBurgername() + ": " + burgers[i].getBurgerprice() + "원");
        }
    }
    
    //사이드메뉴 불러오기
    private static void getSideMenu() {
    	for (int i = 0; i < sidemenus.length; i++) {
    		System.out.println( i+1 + ". " + sidemenus[i].getSidemenuname() + ": " + sidemenus[i].getSidemenuprice() + "원" );
    	}
    }
    
    //주문내역 보여주기
    private static void showOrderList() {
        int bonum = scanner.nextInt() - 1; //배열에 저장하려고 -1을 해줌
        //int sinum = scanner.nextInt() - 1;
    	//위의 것은 번호를 각각 다르게 설정했을때 적용해볼것.
        Burger burger = burgers[bonum]; //배열의 시작은 0부터니까 
        //SideMenu sidemenu = sidemenus[sinum];
        System.out.println("------------------------------------------");
        System.out.println(burger.getBurgername()+", " + " 가격은 " + burger.getBurgerprice() + "원 입니다. ");
    }
    
    
}