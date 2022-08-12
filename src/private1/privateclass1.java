package private1;

public class privateclass1 {
  private void m1()
  {
	  System.out.println("private m1");
  }
  private void m2()
  {
	  System.out.println("private m2");
	  privateclass1 ppc1=new privateclass1();
	  ppc1.m1();
  }
	public static void main(String[] args) {
		 privateclass1 ppc2=new privateclass1(); 
		 ppc2.m1();
		 ppc2.m2();
	}

}
