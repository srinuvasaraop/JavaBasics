package exceptionhandling;

public class Test1 {

	public static void main(String[] args) {
        try  
        {  
        int data=50/0; //may throw exception   
  
        }  
          // try to handle the ArithmeticException using ArrayIndexOutOfBoundsException  
        catch(Exception e)  
        {  
            System.out.println(e.getMessage());
           // e.getMessage();
            System.out.println("rest of the code"); 
            System.out.println("rest of the code");  
        }  
        System.out.println("rest of the code");  
    }  
      
} 