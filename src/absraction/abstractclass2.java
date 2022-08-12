package absraction;

public class abstractclass2 extends abstractclassexp {

	public void m2(){
		System.out.println("child");
	}

	public static void main(String[] args) {
		abstractclass2 abs = new abstractclass2();
		abs.m1();
		abs.m2();
		abs.m3();

	}
	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

}


