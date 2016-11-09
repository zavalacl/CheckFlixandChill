import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.io.InputStreamReader;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class MovieApp {
	
	public static Date addDays(Date d, int days) {
        d.setTime(d.getTime() + days * 1000 * 60 * 60 * 24);
        return d; }
	
	public static void main(String[] args) throws FileNotFoundException {
//		Date backDate = new Date();
//		Date today = new Date(); 
//		backDate = addDays(today, 14);
//		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
//		String stDate = df.format(backDate);
//		String now = df.format(today);
//		int n = 0;
		File file = new File("movieInventory.txt");
//		String toCheck = " ";
		String answer = "y";

		//display list by reading all file lines
		//Search text for director
		//Search text for title keywords
		//if checked out, let them know
		//if not, check it out to them and set return date to 2 weeks from now
		
		ArrayList<Movie> movieArray = new ArrayList<Movie>();
		
		file = new File("movieInventory.txt");
		Scanner scan = new Scanner(System.in);

		
		BufferedReader br = null;
		String line;
		
		
//      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd");
		
		try{
			FileReader fr = new FileReader(file);
			br= new BufferedReader(fr);
					
					
			while((line = br.readLine()) != null) {
				
				String[] words = line.split(",");
					movieArray.add(new Movie(words[0], words[1], words[2], words[3], words[4]));


				
								}
			} catch(FileNotFoundException e){
				System.out.println(e);
		}catch (IOException e){
			System.out.println(e);
		}
		System.out.println("Welcome to Checkflix and Chill!");
		while (answer.equalsIgnoreCase("y")) {
		System.out.println("How would you like to view Our Inventory?");
		System.out.println("By: Title, Director, Genre or Type anything to View All?");
		System.out.println("To check out a film, you must search by title.");
		String search = scan.next();
		search = search.toLowerCase();
		switch (search){
		case "title":
		System.out.println("What title are you looking for?");
		String title = scan.next();
		for (Movie m : movieArray){
			if (m.getTitle().contains(title)){
					System.out.println(m.toString());
			}
		}
		System.out.println("I'm sorry that doesn't match a Movie Title in our Database.");
		break;
		case "director":
			System.out.println("What Director are you looking for?");
			String director = scan.next();
			for (Movie m : movieArray){
				if (m.getDirector().contains(director)){
					System.out.println(m.toString());
				}
				//if (!m.getDirector().contains(director)){
				//	System.out.println("I'm sorry that doesn't match a Director in our Database.");
				//}
			}
			System.out.println("I'm sorry that doesn't match a Director in our Database.");
			break;
		case "genre":
			System.out.println("What Genre are you looking for?");
			String genre = scan.next();
			for (Movie m : movieArray){
				if (m.getGenre().contains(genre)){
					System.out.println(m.toString());
				}
			}
			System.out.println("I'm sorry that doesn't match a Genre in our Database.");
			break;
		default:
			for (Movie m : movieArray){
				System.out.println(m.toString());
			}
			break;
		}
		// output continue options
		System.out.println("Would you like to Search again? Please enter y or n:");
		answer = scan.next();
		// Validate continue options
		answer = Validation.answer(answer);
		
	//	for (Movie m : movieArray) {
	//  System.out.println(m.getDueDate());
		}
		System.out.println("Thank you for using CheckFlix and Chill. Have a wonderful Day!");
		scan.close();
	}
}
		