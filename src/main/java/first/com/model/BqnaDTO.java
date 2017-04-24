package first.com.model;

import java.util.Date;

public class BqnaDTO {
	
	private int bqna_id;
	private int member_id;
	private String bqna_subject;
	private String bqna_content;
	private int bqna_count;
	private int bqna_recommend;
	private Date bqna_date;
	private String bqna_tag;

	
	
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

	public String getBqna_subject() {
		return bqna_subject;
	}

	public void setBqna_subject(String bqna_subject) {
		this.bqna_subject = bqna_subject;
	}

	public String getBqna_content() {
		return bqna_content;
	}

	public void setBqna_content(String bqna_content) {
		this.bqna_content = bqna_content;
	}

	public int getBqna_count() {
		return bqna_count;
	}

	public void setBqna_count(int bqna_count) {
		this.bqna_count = bqna_count;
	}

	public int getBqna_recommend() {
		return bqna_recommend;
	}

	public void setBqna_recommend(int bqna_recommend) {
		this.bqna_recommend = bqna_recommend;
	}

	public Date getBqna_date() {
		return bqna_date;
	}

	public void setBqna_date(Date bqna_date) {
		this.bqna_date = bqna_date;
	}

	public String getBqna_tag() {
		return bqna_tag;
	}

	public void setBqna_tag(String bqna_tag) {
		this.bqna_tag = bqna_tag;
	}
	
}
