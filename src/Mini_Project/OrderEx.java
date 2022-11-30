package Mini_Project;

import java.util.ArrayList;
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
     
     //선택한 버거 저장
     static ArrayList<Burger> saveburgers = new ArrayList<Burger>();
     //선택한 사이드메뉴 저장
     static ArrayList<SideMenu> savesidemenus = new ArrayList<SideMenu>();
     
     
     //메인 시작
    public static void main(String[] args) {
    	//데이터 저장
    	//saveburgers.add(burgers[0]);
    	//savesidemenus.add(sidemenus[0]);
    	//임의의 값을 넣겠다. 라는 생각으로 0번째에 넣겠다고 한 것임.
    	
    	System.out.println("환영합니다!\n솔이네 입니다."
        				+ "\n원하시는 메뉴를 입력해주세요.");
        System.out.println("===============================================");
        System.out.println(" 1. 메뉴 보기 | 2. 주문 하기 | 3. 주문 내역 | 4.종료 하기 ");
        System.out.println("===============================================");
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
                saveburgers.add(burgers[burgernum-1]);
                System.out.println("------------------------------------------");
            	System.out.println("사이드 메뉴를 추가 하시겠습니까?");
            	System.out.println("원하시는 메뉴의 번호를 입력 해주세요.");
            	getSideMenu();
            	System.out.println(" ");
            	System.out.println("------------------------------------------");
            	System.out.println("선택 -> ");
            	int sidenum = scanner.nextInt();
            	savesidemenus.add(sidemenus[sidenum-1]);
            	System.out.println("주문완료 되었습니다. 3번을 눌러 주문확인을 해주세요.");
            } else if (selectnum == 3) {
            	System.out.println("------------------------------------------");
            	System.out.println("고객님의 주문내역은");
                showOrderList();
                break;
            } else { 
                System.out.println("잘못 입력하였습니다.\n1번을 다시 눌러 이전 화면으로 돌아가주십시오.\n"
                				+ "1,2,3번 중에 다시 입력해 주세요.");
            }
            }
        System.out.println("------------------------------------------");
        System.out.println("주문이 완료 되었습니다. 다음 고객님 이용 부탁드립니다.\n"
				+ "오늘도 평안한 하루 보내십시오<3");
    }

    //메인 닫힘
    
    //햄버거 목록 불러오기
    private static void getMenu() {
        System.out.println("------------------------------------------");
        System.out.println("<메뉴>");
        for (int i = 0; i < burgers.length; i++) {
            System.out.println(i + 1 + ". " + burgers[i].getBurgername() + " : " + burgers[i].getBurgerprice() + "원");
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
    	int result=0;
       for(Burger burger : saveburgers) {  
    	   result += burger.getBurgerprice();
    	   System.out.print(burger.getBurgername()+" ,");
       }
       for(SideMenu sidemenu : savesidemenus) {
    	   result += sidemenu.getSidemenuprice();
    	   System.out.println(sidemenu.getSidemenuname());
       }
       System.out.println("결제하실 금액은 "+result +"원 입니다.");
    }
    
 
   
    
    
}