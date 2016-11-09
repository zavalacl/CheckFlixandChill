import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.IIOException;

import java.util.Date;

public class MovieApp {
	
	public static Date addDays(Date d, int days) {
        d.setTime(d.getTime() + days * 1000 * 60 * 60 * 24);
        return d; }
	
	public static void main(String[] args) throws FileNotFoundException {
		Date backDate = new Date();
		Date today = new Date(); 
		backDate = addDays(today, 14);
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		String stDate = df.format(backDate);
		String now = df.format(today);
//		int n = 0;
		File file = new File("movieInventory.txt");
//		String toCheck = " ";
		String answer = "y";
		Scanner scan = new Scanner(System.in);

		//display list by reading all file lines
		//Search text for director
		//Search text for title keywords
		//if checked out, let them know
		//if not, check it out to them and set return date to 2 weeks from now
		System.out.println("Welcome to Checkflix and Chill!");
		while (answer.equalsIgnoreCase("y")) {
		ArrayList<Movie> movieArray = new ArrayList<Movie>();
		
		file = new File("movieInventory.txt");
		

		
		BufferedReader br = null;
		String line;
		
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
		
		
		System.out.println("How would you like to view Our Inventory?");
		System.out.println("Please type: Title, Director, Genre or anything else to view all films?");
		System.out.println("To Check out a film Please search by Title.");
		String search = scan.next();
		search = search.toLowerCase();
		switch (search){
		case "title":
		System.out.println("What title are you looking for?");
		String title = scan.next();
		for (Movie m : movieArray){
			if (m.getTitle().contains(title)){
					System.out.println("Movie: " + m.toString());
					System.out.println();
					
					System.out.println("Would you like to check this movie out (y/n) ? " + m.getTitle());
					
					String choice = "y";
					choice = scan.next();
					if (choice.equalsIgnoreCase("y")){
						m.setStatus("Checked Out");
						System.out.println("Return this movie on: " + stDate);
						m.setDueDate(stDate);
						System.out.println(m);
	
					}else {
						System.out.println("Movie not checked out");
					}
			} 
		}
		System.out.println("I'm sorry that doesn't match a Movie Title in our Database.");
		break;
		case "director":
			System.out.println("What Director are you looking for?");
			String director = scan.next();
			for (Movie m : movieArray){
				if (m.getDirector().contains(director)){
					System.out.println("Movie: " + m.toString());
				} 
				
			}
			System.out.println("I'm sorry that doesn't match a Director in our Database.");
			break;
		case "genre":
			System.out.println("What Genre are you looking for?");
			System.out.println("Action, Adventure, Animation, Comedy, Drama, Fantasy, Horror, "
					+ "Mystery, RomCom, Sci-Fi, or Thriller: ");
			String genre = scan.next();
			for (Movie m : movieArray){
				if (m.getGenre().contains(genre)){
					System.out.println("Movie: " + m.toString());
				}  
			}
			System.out.println("I'm sorry that doesn't match a Genre in our Database.");
			break;
		default:
			for (Movie m : movieArray){
				System.out.println("Movie: " + m.toString());
			}
			break;
		}
		
			try(PrintWriter outputFile = new PrintWriter("movieInventory.txt")){
				for(Movie m: movieArray){
					outputFile.println(m);	
				} 
				
			}

				System.out.println("Would you like to Search again? Please enter y or n:");
				answer = scan.next();
				// Validate continue options
				answer = Validation.answer(answer);
			

			try(PrintWriter outputFile = new PrintWriter("movieInventory.txt")){
				for(Movie m: movieArray){
					outputFile.println(m);	
				} 
			}
			
		}
		System.out.println("Thank you for using CheckFlix and Chill. Have a wonderful Day!");
		scan.close();
	}	
}
		

		
		
	


		