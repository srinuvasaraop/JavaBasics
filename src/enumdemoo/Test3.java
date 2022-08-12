package enumdemoo;

public class Test3 {
  public enum Rose
  {
	  RED(10),WHITE(20),YELLOW(54),GREEN(89);
  
 private int i; 
 Rose(int i)
  {
	this.i=i;  
  }
  }
	public static void main(String[] args) {
		for(Rose r:Rose.values())
					System.out.println(r+"   "+r.i);
			}
}
