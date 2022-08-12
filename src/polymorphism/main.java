package polymorphism;

public class main {

	public static void main(String[] args) {

		/*A person at the same time can have different characteristics
		. Like a man at the same time is a father, a husband, an employee
		. So the same person possesses different behavior in different situations.
		This is called polymorphism.*/
		
		dog d = new dog();// child type object and child constructor
		d.sound();
		d.speed();
		Animal a = new Animal();// parent type and parent constructor
		a.sound();

		Animal a1 = new dog();// parent type and child constructr
		a1.sound();  //runtime polymorphism
		a1.speed();
	}

}
