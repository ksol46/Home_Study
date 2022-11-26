package Mini_Project;

import java.util.ArrayList;

public class OrderEx {
	static ArrayList<Hamburger> OrderList = new ArrayList<Hamburger>();
	public static void main(String[] args) {
		//버거만 주문
		Hamburger order1 = new Hamburger("김솔",0406);
		Hamburger order2 = new Hamburger("김영진",1022);
		//감자 추가
		Hamburger order3 = new Hamburger("김태온",1020);
		Hamburger order4 = new Hamburger("송정희",1025);
		//콜라 추가
		Hamburger order5 = new Hamburger("김상민",0505);
		//세트
		Hamburger order6 = new Hamburger("손민지",0713);
		
		OrderList.add(order1);
		OrderList.add(order2);
		OrderList.add(order3);
		OrderList.add(order4);
		OrderList.add(order5);
		OrderList.add(order6);
		
		ShowAllOrder();
		
	}

}
