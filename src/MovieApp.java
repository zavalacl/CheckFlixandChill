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
		
		ArrayList<Movie> movieArray = new ArrayList<Movie>(69);
		
		File file = new File("movieInventory.txt");
		
		Scanner scan = new Scanner(file);
		
		while (scan.hasNextLine()){
			String line = scan.nextLine();
			String[] words = line.split(",");
			
			
			movieArray.add(new Movie(words[0], words[1], words[2], words[3]));

		}
//		Scanner input = new Scanner(System.in);			
//		System.out.println("Search by movie title: ");
//		String choice = input.next();
//		
//		for(Movie i : movieArray){
//			if (choice.equalsIgnoreCase(i.getTitle()));
//				System.out.println(movieArray.get(0).getTitle());
		}
		
		
		
		/*while (scan.hasNextLine()){
			String line = scan.nextLine();
			if(line.contains(word)){
				System.out.println("Found: " + word);
				break;
			}
		}*/
		
		
	}


