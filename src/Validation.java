import java.util.Scanner;

public class Validation {

	static Scanner scan = new Scanner(System.in);
	
	
		public static String answer(String answer) {
			while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n") ) {
				
				if (answer.equalsIgnoreCase("y"));
				
				else if (!answer.equalsIgnoreCase("n")); {
				System.out.println("Please enter a valid answer");
				answer = scan.next(); }
				
				if (answer.equalsIgnoreCase("n")) {
				break; }	
		}
			return answer;
	
		}

		
}
	
