package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		String path = "/Users/heenahans/Downloads/test.txt";
		
		ReadUsingFileInputStream(path);
		
		ReadUsingBufferedReader(path);
		ReadFileUsingFileReader(path);
		ReadFileUsingScanner(path);


	}
	
	public static void ReadUsingFileInputStream(String path) {
		FileInputStream fip = null;
		
		try {
			
			File file = new File(path);
			 fip = new FileInputStream(file);
			 System.out.println("File InputStream - File content is:");
			
			int c = 0;
			while((c = fip.read()) !=-1) {
				System.out.println((char) c);
			}
			
			
			
		}
		catch ( Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				fip.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void ReadUsingBufferedReader(String path) {
		
		BufferedReader br = null;
		
		try {
			
			File file = new File(path);
			 br = new BufferedReader(new FileReader(file));
			
			System.out.println("Buffered reader - File content is:");
			
			int c=0;
			while((c = br.read())!=-1) {
				System.out.println((char) c);
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	public static void ReadFileUsingFileReader(String path) {
		
		FileReader fr = null;
		
		try {
		 fr = new FileReader(path);
		System.out.println("File Reader - File content is:");
		
		int c = 0;
		
		while((c= fr.read())!=-1) {
			System.out.println((char)c);
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	public static void ReadFileUsingScanner(String path) {
		
		Scanner sc = null;
		
		try {
		File file = new File(path);
		 sc = new Scanner(file);
		
		System.out.println("File Reader - File content is:");
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
			
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				sc.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}


}
