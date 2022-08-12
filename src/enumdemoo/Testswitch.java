package enumdemoo;

public class Testswitch {
  public enum Animals
  {
	  COW,BUFFLLOW,GOAT,DOG,TIGER,ELEPHANT
  }
	 
  
  public static void main(String[]args)
  {
	  Animals animal=Animals.COW;  
	  switch (animal) {
	case COW:    
	   System.out.println("amba");  
	   break;  //optional  
	  case BUFFLLOW:    
		  System.out.println("amba");   
	   break;
	  case GOAT:    
		  System.out.println("meyy");    
		   break;
	  case DOG:    
		  System.out.println("bow");     
		   break;
	  case TIGER:    
		  System.out.println("amba");     
		   break;//optional  
	  case ELEPHANT:    
		  System.out.println("uyyy");     
		   break;
	  default:     
		  System.out.println("its not animal yar");   
	  }     
  }
}
