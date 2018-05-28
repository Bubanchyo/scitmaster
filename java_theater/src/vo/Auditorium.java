package vo;

public class Auditorium {
	private int auditNo;
	private int cinemaNo;
	private String auditName;
	private String sessionTime;
	private int movieNo;

	public Auditorium() {
	}

	public Auditorium(int cinemaNo, String auditName, String sessionTime, int movieNo) {
		super();
		this.cinemaNo = cinemaNo;
		this.auditName = auditName;
		this.sessionTime = sessionTime;
		this.movieNo = movieNo;
	}

	public int getAuditNo() {
		return auditNo;
	}

	public void setAuditNo(int auditNo) {
		this.auditNo = auditNo;
	}

	public int getCinemaNo() {
		return cinemaNo;
	}

	public void setCinemaNo(int cinemaNo) {
		this.cinemaNo = cinemaNo;
	}

	public String getAuditName() {
		return auditName;
	}

	public void setAuditName(String auditName) {
		this.auditName = auditName;
	}

	public String getSessionTime() {
		return sessionTime;
	}

	public void setSessionTime(String sessionTime) {
		this.sessionTime = sessionTime;
	}

	public int getMovieNo() {
		return movieNo;
	}

	public void setMovieNo(int movieNo) {
		this.movieNo = movieNo;
	}

	@Override
	public String toString() {
		return "Auditorium [auditNo=" + auditNo + ", cinemaNo=" + cinemaNo + ", auditName=" + auditName
				+ ", sessionTime=" + sessionTime + ", movieNo=" + movieNo + "]";
	}

}
