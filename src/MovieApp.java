import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class MovieApp {

	public static void main(String[] args) throws FileNotFoundException {
		//display list by reading all file lines
		//Search text for director
		//Search text for title keywords
		//if checked out, let them know
		//if not, check it out to them and set return date to 2 weeks from now
		System.out.println("Welcome to the CheckFlix and Chill Movie Checkout System");
		ArrayList<Movie> movieArray = new ArrayList<Movie>();
		int n = 0;
		File file = new File("movieInventory.txt");
		String toCheck = " ";
		String answer = "y";
		
		Scanner scan = new Scanner(file);
		
		while (scan.hasNextLine()){
			String line = scan.nextLine();
			String[] words = line.split(",");
			
			
			movieArray.add(new Movie(words[0], words[1], words[2], words[3]));
			
		}
		while (answer.equalsIgnoreCase("y")) {			
		System.out.println("Search by movie title: ");
		Scanner input = new Scanner(System.in);
		String choice = input.next();
		
		for (Movie mov : movieArray){
			if (choice.equalsIgnoreCase(mov.getTitle())) 
				System.out.println("The Following" + mov.toString());
				toCheck = mov.getTitle();
		}
		
		  System.out.println("Movie not Found");
		  
		  //Once found offer to check out movie
		  //System.out.println("Would you like to check out + mov.getTitle?")
		  // toCheck setStatus Checked Out
		}

	
	
	
		
		
		
		
				// output continue options
				System.out.println("Would you like to play again? Please enter y or n:");
				answer = scan.next();
				// Validate continue options
				answer = Validation.answer(answer);
	}
//	}
}	

/*while (scan.hasNextLine()){
String line = scan.nextLine();
if(line.contains(word)){
	System.out.println("Found: " + word);
	break;
}
}*/