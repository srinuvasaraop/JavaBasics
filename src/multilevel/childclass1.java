package multilevel;

public class childclass1  extends Parentclass{
	int k=1203;
    public void m3()
   {
	 System.out.println("this is child class m3 method");
   }
		public static void main(String[] args) {
		childclass1 ch1=new childclass1();
		ch1.m1();
		ch1.m2();
		ch1.m3();
		System.out.println(ch1.i);
		System.out.println(ch1.name);
		 System.out.println(ch1.k);
		
		Parentclass pp=new Parentclass();
		System.out.println(pp.i);
		System.out.println(pp.name);
		pp.m1();
		pp.m2();
	   
	}

}
