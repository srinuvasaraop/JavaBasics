package srikanth;

public class instanceVariables {
	int age = 10;
	String name = "SHIVA";
	public void m1() {
		// instance variables direcle instance method accessing
		System.out.println(age);
		System.out.println(name);
		// by using object also
		instanceVariables ii = new instanceVariables();
		System.out.println(ii.age);
		System.out.println(ii.name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		instanceVariables ii = new instanceVariables();
		ii.m1();
	}
}
