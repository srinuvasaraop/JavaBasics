package file;

import java.io.File;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws IOException {
		boolean bool = false;
		String path = "";
		try {
			File file = new File(
					"C:\\Users\\srinuvas\\Desktop\\FILE Claass\\abcfg.txt");
			System.out.println(file.getName());
			file.createNewFile();
			System.out.println(file);
			File file2 = file.getCanonicalFile();
			System.out.println(file2);
			bool = file2.exists();
			path = file2.getAbsolutePath();
			System.out.println(bool);
			if (bool) {
				System.out.println(path + "  Exists  " + bool);
			}
		} catch (IOException i) {
			i.printStackTrace();
		}

	}
}
