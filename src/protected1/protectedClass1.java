package protected1;

public class protectedClass1 {
	protected void m1() {
		System.out.println("protected method");
	}

	public static void main(String[] args) {

		protectedClass1 prct = new protectedClass1();
		prct.m1();
	}

}
