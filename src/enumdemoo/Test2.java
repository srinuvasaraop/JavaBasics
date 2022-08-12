package enumdemoo;

public class Test2 {

public enum day
{
	
	//semicolon(;) is optional here 
  MONDAY,TUESADAT,WENSDAY,THURSDAY,FRIDAY,SATDAY;	
}
	public static void main(String[] args) {
		for(day d:day.values())
		{
			System.out.println(d);
		}
      day valueOf = day.valueOf("MONDAY");
      day valueOf1 = day.MONDAY;
      System.out.println("directly accessing "+valueOf1);
      System.out.println("this is using valueof(string ) "+valueOf);
      System.out.println("Index of tuesaday is: "+day.valueOf("FRIDAY").ordinal()); 
	}

}
