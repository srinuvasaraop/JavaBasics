package file;

import java.io.File;

public class Test3 {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\srinuvas\\Desktop\\FILE Claass");
		String[] list = file.list();
		for(String li:list)
		{
			System.out.println(li);
		}

	}

}
