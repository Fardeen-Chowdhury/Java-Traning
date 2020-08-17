package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		
		String filename = "C:\\Users\\Fardeen\\Desktop\\eclipse-workspace\\JavaTraining\\FileToWrite.txt";
		String message = "I'm Writing data that will be placed to a file. Thank you";
		
		File file = new File(filename);
		
		FileWriter fw;
		try {
			fw = new FileWriter(file);
			fw.write(message);
			fw.close();
		} catch (IOException e) {
			System.out.println("Error: Could");
			e.printStackTrace();
		}finally {
			System.out.println("Closing the fileWriter");
		}
		
		
	}

}
