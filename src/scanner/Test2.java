package scanner;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		String name = "helo shiva how r u";
		Scanner sc = new Scanner(name);
		System.out.println(sc.next());
		// System.out.println(sc.nextLine());
		System.out.println("--------Enter Your Details-------- ");
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name1 = in.next();
		System.out.println(name1);
		System.out.println("enter your age");
		int nextInt = in.nextInt();
		System.out.println(nextInt);
        System.out.println("enter your salary");
        float fsal=in.nextFloat();
        System.out.println(fsal);
		sc.close();
	}

}
