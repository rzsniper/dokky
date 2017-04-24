package first.com.model;

import java.util.Date;

public class BCjobDTO {
	
	private int bcjob_id;
	private int bjob_id;
	private int member_id;
	private String bcjob_content;
	private Date bcjob_date;

	
	
	public int getBcjob_id() {
		return bcjob_id;
	}

	public void setBcjob_id(int bcjob_id) {
		this.bcjob_id = bcjob_id;
	}

	public int getBjob_id() {
		return bjob_id;
	}

	public void setBjob_id(int bjob_id) {
		this.bjob_id = bjob_id;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getBcjob_content() {
		return bcjob_content;
	}

	public void setBcjob_content(String bcjob_content) {
		this.bcjob_content = bcjob_content;
	}

	public Date getBcjob_date() {
		return bcjob_date;
	}

	public void setBcjob_date(Date bcjob_date) {
		this.bcjob_date = bcjob_date;
	}

	
}
