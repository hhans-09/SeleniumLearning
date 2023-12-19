package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateFile {
	
public static void main(String[] args) {
		
		String path = "/Users/heenahans/Downloads/sample.txt";
		
		
		// 1. Using File 
		File file = new File(path);
		
		try {
			boolean flag = file.createNewFile();
			if(flag) {
				System.out.println("file is created");
			} else {
				System.out.println("file is not created");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		// 2. FileOutstream along with Scanner
		
		try {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name with location path:");
		String fileName = sc.nextLine();
		
		FileOutputStream fos = new FileOutputStream(fileName, true);
		System.out.println("Enter the file content:");
		String fileContent = sc.nextLine();
		byte b[] = fileContent.getBytes();
		
		fos.write(b);
		fos.close();
		
		System.out.println("File is saved on the given path:");
		
		
		}
		
		catch(Exception e) {
			System.out.println("Exceptiopn is coming:");
			e.printStackTrace();
		}
		
		
		//3. Java nio package
		
		
		try {
			Path pathlocation = Paths.get("/Users/heenahans/Downloads/newfile.txt");
			Path newPath = Files.createFile(pathlocation);
			System.out.println("new file created at : "+newPath);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
