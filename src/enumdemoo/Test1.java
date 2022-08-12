package enumdemoo;

public class Test1 {

	public enum Seasons {
		// better to write all names in capital letters only.
		WINTER, SPRING, SUMMER, FALL
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = new Test1();
		   for(Seasons sea:Seasons.values()){
			   System.out.println(sea);
		   }
	}

}
