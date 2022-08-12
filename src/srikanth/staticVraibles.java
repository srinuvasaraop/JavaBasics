package srikanth;

public class staticVraibles {
	static String name = "eswara";
	static int age = 27;

	public void m1() {
		// accessing with calls name bcz static variable

		System.out.println(staticVraibles.name);
		System.out.println(staticVraibles.age);

		// accessing directly

		System.out.println(name);
		System.out.println(age);
		// accessin with object

		staticVraibles a = new staticVraibles();
		System.out.println(a.name);
		System.out.println(a.age);

	}

	public static void main(String[] args) {
		staticVraibles a = new staticVraibles();
		a.m1();

	}

}