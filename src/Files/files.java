package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class files {

	public static void main(String[] args) {
		String filename = "C:\\Users\\Fardeen\\Desktop\\eclipse-workspace\\JavaTraining\\FileToRead.txt";
		String text = null;
		File file= new File(filename);
		
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
		 text = br.readLine();
		 System.out.println(br.readLine());
		  br.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found " + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error couldn't read the data " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Finished reading the file");
		}
		
		System.out.println(text);
		
	}

}
