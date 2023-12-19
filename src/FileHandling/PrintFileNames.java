package FileHandling;

import java.io.File;
import java.util.Arrays;

public class PrintFileNames {

	public static void main(String[] args) {
		String path = "/Users/heenahans/Downloads";
		
		File file = new File(path);
		
		File downloadDir[] = file.listFiles();
		
		Arrays.sort(downloadDir);
		
		for (File f :downloadDir ) {
			if(f.isFile()) {
				System.out.println("File : " + f.getName());
			}
			else if(f.isDirectory()) {
				System.out.println("Directory: "+ f.getName());
			} else {
				System.out.println("Not Known: "+ f.getName());
			}
		}

	}

}
