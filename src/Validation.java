import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Validation {
	
	public static Date addDays(Date d, int days) {
	    d.setTime(d.getTime() + days * 1000 * 60 * 60 * 24);
	    return d; }
	
	public static void main(String[] args) {
		
	
	Date backDate = new Date();
	Date today = new Date(); 
	
	
	
	//String now = df.format(today); 
	String status = "Checked Out";
	
	backDate = addDays(today, 14);
	DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
	String stDate = df.format(backDate);
	String dueDate = stDate;
	
	}
	

	

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


	
