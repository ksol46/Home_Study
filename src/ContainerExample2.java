

public class ContainerExample2 {

	public static void main(String[] args) {
		Container2<String> container1 = new Container2<String>();
		container1.set("홍길동");
		String str = container1.get();
		System.out.println(str);
	}

}
