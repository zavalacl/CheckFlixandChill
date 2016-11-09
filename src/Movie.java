import java.time.LocalDate;

public class Movie {
	private String title;
	private String director;
	private String genre;
	private String status;
	private LocalDate dueDate;
	
	
	public Movie(String title, String director, String genre, String status, LocalDate dueDate) {
		//super();
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.status = status;
		this.dueDate = dueDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	//@Override
	public String toString(){
		return "Movie " + title + ", " + director + ", " + genre + ", " + status;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}
