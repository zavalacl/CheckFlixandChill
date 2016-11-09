
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CheckedOut extends Movie {
	
	public static Date addDays(Date d, int days) {
        d.setTime(d.getTime() + days * 1000 * 60 * 60 * 24);
        return d; }
	
	
	public static void main(String[] args) {
		
	}
		public CheckedOut(String title, String director, String genre, String status, Date date, String dueDate) {
			
			
		
		super(title, director, genre, status, dueDate);
		Date backDate = new Date();
		Date today = new Date(); 
		backDate = addDays(today, 14);
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		String stDate = df.format(backDate);
		//String now = df.format(today);
		status = "Checked Out";
		dueDate = stDate;
		
	}

	
	
	
	
	@Override
	public String toString(){
		String out = "Checked out: " + super.toString() + "[" + getDueDate() + "] ";
		return out;
	}
}
