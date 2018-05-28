package vo;

public class Cinema {
	private int cinemaNo;
	private String cinemaLoc;

	public Cinema() {
	}

	public Cinema(String cinemaLoc) {
		super();
		this.cinemaLoc = cinemaLoc;
	}

	public int getCinemaNo() {
		return cinemaNo;
	}

	public void setCinemaNo(int cinemaNo) {
		this.cinemaNo = cinemaNo;
	}

	public String getCinemaLoc() {
		return cinemaLoc;
	}

	public void setCinemaLoc(String cinemaLoc) {
		this.cinemaLoc = cinemaLoc;
	}

	@Override
	public String toString() {
		return "Cinema [cinemaNo=" + cinemaNo + ", cinemaLoc=" + cinemaLoc + "]";
	}

}
