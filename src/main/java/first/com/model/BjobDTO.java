package first.com.model;

import java.util.Date;

public class BjobDTO {
	
	private int bjob_id;
	private int memeber_id;
	private String bjob_subject;
	private String bjob_content;
	private Date bjob_date;
	private int bjob_count;
	private int bjob_recommend;
	private String bjob_tag;

	
	
	public int getBjob_id() {
		return bjob_id;
	}

	public void setBjob_id(int bjob_id) {
		this.bjob_id = bjob_id;
	}

	public int getMemeber_id() {
		return memeber_id;
	}

	public void setMemeber_id(int memeber_id) {
		this.memeber_id = memeber_id;
	}

	public String getBjob_subject() {
		return bjob_subject;
	}

	public void setBjob_subject(String bjob_subject) {
		this.bjob_subject = bjob_subject;
	}

	public String getBjob_content() {
		return bjob_content;
	}

	public void setBjob_content(String bjob_content) {
		this.bjob_content = bjob_content;
	}

	public Date getBjob_date() {
		return bjob_date;
	}

	public void setBjob_date(Date bjob_date) {
		this.bjob_date = bjob_date;
	}

	public int getBjob_count() {
		return bjob_count;
	}

	public void setBjob_count(int bjob_count) {
		this.bjob_count = bjob_count;
	}

	public int getBjob_recommend() {
		return bjob_recommend;
	}

	public void setBjob_recommend(int bjob_recommend) {
		this.bjob_recommend = bjob_recommend;
	}

	public String getBjob_tag() {
		return bjob_tag;
	}

	public void setBjob_tag(String bjob_tag) {
		this.bjob_tag = bjob_tag;
	}
	

}
