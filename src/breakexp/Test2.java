package breakexp;

public class Test2 {

	public static void main(String[] args) {
	int [] array={10,20,30,40,50};
	for(int i:array)
	{
		System.out.println(i);
		if(i==30)
		{
			continue;
		}
		System.out.println("helo"+i);
	}
	}

}
