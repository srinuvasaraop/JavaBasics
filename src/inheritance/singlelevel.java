package inheritance;

public class singlelevel extends Parentclass{
	
	public static void main(String[] args) {
		
		singlelevel sig=new singlelevel();
	System.out.println(sig.i);
	System.out.println(sig.name);
	sig.m1();
	sig.m2();
	
	Parentclass  p=new Parentclass();
      System.out.println(p.i);
      System.out.println(p.name);
      p.m1();
      p.m2();
      
	}

}
