package file;

import java.io.File;

public class Test4 {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\srinuvas\\Desktop\\FILE Claass");
		File[] listFiles = file.listFiles();
		for (File files : listFiles) {
			System.out.println(files.getName() + " Can Write: "
					+ files.canWrite() + "Is Hidden: " + files.isHidden()
					+ " Length: " + files	.length() + " bytes");
		}
	}

}
