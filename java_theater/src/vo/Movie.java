package vo;

public class Movie {
	private int movieNo;
	private String title;
	private String director;
	private String genre;
	private int runTime;
	private String relDts;
	private String relDte;

	public Movie() {
	}

	public Movie(String title, String director, String genre, int runTime, String relDts, String relDte) {
		super();
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.runTime = runTime;
		this.relDts = relDts;
		this.relDte = relDte;
	}

	public int getMovieNo() {
		return movieNo;
	}

	public void setMovieNo(int movieNo) {
		this.movieNo = movieNo;
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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public String getRelDts() {
		return relDts;
	}

	public void setRelDts(String relDts) {
		this.relDts = relDts;
	}

	public String getRelDte() {
		return relDte;
	}

	public void setRelDte(String relDte) {
		this.relDte = relDte;
	}

	@Override
	public String toString() {
		return "Movie [movieNo=" + movieNo + ", title=" + title + ", director=" + director + ", genre=" + genre
				+ ", runTime=" + runTime + ", relDts=" + relDts + ", relDte=" + relDte + "]";
	}

}
