package Mini_Project;

import java.util.Scanner;

public class Order {

    static Scanner scanner = new Scanner(System.in);
     static Burger[] burgers = new Burger[] {
            new BulgogiBurger("a", 6000),
            new CheeseBurger("b", 5000),
            new ShrimpBurger("c", 5000)
     };
            

    public static void main(String[] args) {
        boolean run = true;
        System.out.println("안녕하세요*^^*\nSol's Hamburger입니다."
        				+ "\n원하시는 메뉴를 선택해주십시오.");
        System.out.println("===============================");
        System.out.println("1. 메뉴보기 | 2. 주문하기 | 3.주문완료");
        System.out.println("===============================");
        System.out.println("선택 -> ");

        while (run) {
            int num = scanner.nextInt();
            if (num == 1) {
                getMenu();
            } else if (num == 2) {
                orderHamburger();
            } else if (num == 3) {
                System.out.println("주문을 완료합니다.");
                break;
            } else {
                System.out.println("1,2,3번 중에 입력해 주세요.");
            }
        }

        System.out.println("프로그램이 종료되었습니다. 다음 고객님 이용 부탁드립니다.");
    }

    private static void getMenu() {
        // TODO 1. 햄버거 목록 불러오기
        System.out.println("-------------------------------------");
        System.out.println("메뉴");
        for (int i = 0; i < burgers.length; i++) {
            System.out.println(i + 1 + ". " + burgers[i].getName() + ": " + burgers[i].getPrice() + "원");
        }
        System.out.println("-------------------------------------");
    }

    private static void orderHamburger() {
        System.out.println("주문할 햄버거의 번호를 입력해주세요");
        int orderNumber = scanner.nextInt() - 1;
        Burger burger = burgers[orderNumber];
        System.out.println("주문한 햄버거는 " + burger.getName() + " 이고," +
                " 가격은 " + burger.getPrice() + "원입니다. ");
        System.out.println("그리고 맛은 " + burger.taste() + "입니다.");
    }
}