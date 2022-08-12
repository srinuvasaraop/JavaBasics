package scanner;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		String str = "Hello/This is JavaTpoint/My name is Abhishe";  
		Scanner scanner = new Scanner(str);
		  System.out.println("Boolean Result: "+scanner.hasNextBoolean()); 
		//Change the delimiter of this scanner  
      scanner.useDelimiter("/"); 
        //Printing the tokenized Strings  
        System.out.println("---Tokenizes String---"); 
     
        while(scanner.hasNext()){  
            System.out.println(scanner.next());  
        } 
        System.out.println("Delimiter used: " +scanner.delimiter()); 
        scanner.close();
	}

}
