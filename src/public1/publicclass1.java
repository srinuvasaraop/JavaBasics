package public1;

public class publicclass1 {
	public void m1() {
    System.out.println("helo m1");
	}

	public void m2() {
		publicclass1 pc1=new publicclass1();
		pc1.m1();
	}

	public static void main(String[] args) {
		publicclass1 pc2=new publicclass1();
		pc2.m1();
		pc2.m2();
			}
}
