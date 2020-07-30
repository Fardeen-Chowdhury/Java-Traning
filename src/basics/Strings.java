package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "Lord of the Ring";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("Th book contains the word " + wordChoice);
		}
		
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Browser is Chrome");
		}
		String fristName = "Fardeen";
		String lastName = "Chowdhury";
		String SSN = "1234567890";
		System.out.println("There are " + SSN.length() + " digits in your SSN. ");
		System.out.println(fristName.substring(0,4));
		System.out.println(lastName.substring(0,5));
		System.out.println(SSN.substring(5));;
				

	}

}
