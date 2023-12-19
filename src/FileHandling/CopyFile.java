package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		copyFile();

	}
	
	public static void copyFile() {
		File file = new File("/Users/heenahans/Downloads/FHeena_Resume.pdf");
		File opfile = new File("/Users/heenahans/Downloads/FHeena_Resume_copy.pdf");
		
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		
		try {
			fileInputStream = new FileInputStream(file);
			fileOutputStream = new FileOutputStream(opfile);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			System.out.println(fileInputStream.available()); //bytes availble in file
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		boolean i = true;
		
		try {
			while(i = fileInputStream.read()!=-1) {
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			if(fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			if(fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
		
		

	}

}
