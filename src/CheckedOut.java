import java.sql.Date;
import java.time.LocalDate;

public class CheckedOut extends Movie {
	private Date date;
	
	public CheckedOut(String title, String director, String genre, String status, Date date, LocalDate DueDate) {
		
		super(title, director, genre, status, DueDate);
		this.date = date;
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString(){
		String out = "Checked out: " + super.toString() + "[" + date + "] ";
		return out;
	}
}
