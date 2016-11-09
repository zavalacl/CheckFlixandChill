import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;



public class MovieApp {

	public static void main(String[] args) throws FileNotFoundException {
		//display list by reading all file lines
		//Search text for director
		//Search text for title keywords
		//if checked out, let them know
		//if not, check it out to them and set return date to 2 weeks from now
//<<<<<<< HEAD
		System.out.println("Welcome to the CheckFlix and Chill Movie Checkout System");
		ArrayList<Movie> movieArray = new ArrayList<Movie>();
		int n = 0;
		File file = new File("movieInventory.txt");
		String toCheck = " ";
		String answer = "y";
//=======
		
		ArrayList<Movie> movieArray = new ArrayList<Movie>();
		
		File file = new File("movieInventory.txt");
		//Scanner scan = new Scanner(file);

//>>>>>>> 86b118ed929dc3cec062b80db43a964ff6f4ba8d
		
		BufferedReader br = null;
		String line;
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd");
		
		try{
			FileReader fr = new FileReader(file);
			br= new BufferedReader(fr);
					
					
			while((line = br.readLine()) != null) {
				
				String[] words = line.split(",");
				String dateToString = words[4];
				if(dateToString.isEmpty()){
					movieArray.add(new Movie(words[0], words[1], words[2], words[3], null));

				}else{

				LocalDate date = LocalDate.parse(dateToString, formatter);

				movieArray.add(new Movie(words[0], words[1], words[2], words[3], date));
				}
			}
			
//<<<<<<< HEAD
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
//=======
			} catch(FileNotFoundException e){
				System.out.println(e);
		}catch (IOException e){
			System.out.println(e);
		}
		for (Movie m : movieArray) {
			System.out.println(m.getDueDate());
		}
		

		/*
		String[] words = null;
		String text = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			while((text = reader.readLine()) != null && !text.isEmpty()) {
			    words = text.split(",");
				movieArray.add(new Movie(words[0], words[1], words[2], words[3]));	
				//System.out.println(movieArray);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
		System.out.println(words[1]);
		*/
		
	//	while ((scan.hasNextLine())){
		//	String line = scan.nextLine();
			//String[] words = line.split(",");
		
			
			
		}
		}
//		Scanner input = new Scanner(System.in);			
//		System.out.println("Search by movie title: ");
//		String choice = input.next();
//		
//		for(Movie i : movieArray){
//			if (choice.equalsIgnoreCase(i.getTitle()));
//				System.out.println(movieArray.get(0).getTitle());
		
>>>>>>> 86b118ed929dc3cec062b80db43a964ff6f4ba8d
		
		  System.out.println("Movie not Found");
		  
		  //Once found offer to check out movie
		  //System.out.println("Would you like to check out + mov.getTitle?")
		  // toCheck setStatus Checked Out
		}

	
	
	
		
		
		
		
//<<<<<<< HEAD
				// output continue options
				System.out.println("Would you like to play again? Please enter y or n:");
				answer = scan.next();
				// Validate continue options
				answer = Validation.answer(answer);
	}
//	}
}	
=======
	
>>>>>>> 86b118ed929dc3cec062b80db43a964ff6f4ba8d

/*while (scan.hasNextLine()){
String line = scan.nextLine();
if(line.contains(word)){
	System.out.println("Found: " + word);
	break;
}
}*/