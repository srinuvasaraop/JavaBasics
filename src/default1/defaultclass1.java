package default1;

public class defaultclass1 {
	
   void m1()
  {
	  System.out.println("helo default m1");
  }
   void m2()
  {
	System.out.println("helo this m2");  
	defaultclass1 def1=new defaultclass1();
	def1.m1();
  }
	public static void main(String[] args) {
		defaultclass1 def2=new defaultclass1();
		def2.m1();
		def2.m2();
	}

}
