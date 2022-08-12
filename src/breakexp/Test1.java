package breakexp;

public class Test1 {
   int i;
	public static void main(String[] args) {
		 int i;
		for(i=3;i<50;i+=3)
		{
			System.out.println(i);
			if(i==15)
			{
				break;
				//if we uncomment below code will get unreachble statement 
				//System.out.println("helo"+i);
			}
			System.out.println("helo"+i);
		}
		System.out.println(i);
	}
	
}
