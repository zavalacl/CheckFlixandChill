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
		
		ArrayList<Movie> movieArray = new ArrayList<Movie>();
		
		File file = new File("movieInventory.txt");
		//Scanner scan = new Scanner(file);

		
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
		
		
		
		
		/*while (scan.hasNextLine()){
			String line = scan.nextLine();
			if(line.contains(word)){
				System.out.println("Found: " + word);
				break;
			}
		}*/
		
		
	


