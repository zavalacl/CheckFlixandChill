
public class Movie {
	private String title;
	private String director;
	private String genre;
	private String status;
	
	
	public Movie(String title, String director, String genre, String status) {
		//super();
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.status = status;
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
	
	@Override
	public String toString(){
		return "Movie" + title + ", " + director + ", " + status;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}
