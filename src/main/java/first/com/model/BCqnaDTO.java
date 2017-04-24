package first.com.model;

import java.util.Date;

public class BCqnaDTO {
	
	private int bcqna_id;
	private int bqna_id;
	private int member_id;
	private String bcqna_content;
	private Date bcqna_date;

	
	
	public int getBcqna_id() {
		return bcqna_id;
	}

	public void setBcqna_id(int bcqna_id) {
		this.bcqna_id = bcqna_id;
	}

	public int getBqna_id() {
		return bqna_id;
	}

	public void setBqna_id(int bqna_id) {
		this.bqna_id = bqna_id;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getBcqna_content() {
		return bcqna_content;
	}

	public void setBcqna_content(String bcqna_content) {
		this.bcqna_content = bcqna_content;
	}

	public Date getBcqna_date() {
		return bcqna_date;
	}

	public void setBcqna_date(Date bcqna_date) {
		this.bcqna_date = bcqna_date;
	}
	

}
