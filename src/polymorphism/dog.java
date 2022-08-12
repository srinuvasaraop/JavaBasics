package polymorphism;

public class dog extends Animal{
	
	@Override
	public  void sound(){
		System.out.println("barks");
	}
	@Override
	public  void speed(){
		System.out.println("every animal 30km some spedd");
	}
}
