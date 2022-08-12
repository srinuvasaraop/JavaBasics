package protected2;

import protected1.protectedClass1;

public class protectedclasspack1 extends protectedClass1 {

	public static void main(String[] args) {
		protectedClass1 pcp2=new protectedClass1();
		//parent class object created but m1 method is not visible here.
		//pcp2.m1();
		protectedclasspack1 ppc2=new protectedclasspack1();
		//child  class object created and method also visible.
		ppc2.m1();
	}

}
