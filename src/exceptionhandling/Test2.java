package exceptionhandling;

public class Test2 {

	public static void main(String[] args) {
		  try  
	        {  
	        int arr[]= {1,3,5,7};  
	        System.out.println(arr[10]); //may throw exception   
	        }  
	            // handling the array exception  
	        catch(Exception e)  
	        {  
	            e.printStackTrace();  
	        }  
	        System.out.println("rest of the code");  
	    }  
	      
	}  