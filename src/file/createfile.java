package file;

import java.io.File;
import java.io.IOException;

public class createfile {

	public static void main(String[] args) throws IOException {
	File file=new File("C:\\Users\\srinuvas\\Desktop\\FILE Claass\\abc.txt");
	if(file.createNewFile())
	{
		System.out.println("the created file name is  "+file.getName());
	}
	else
	{
		System.out.println("file name  not created");
	}
	System.out.println("hi");
	}

}
