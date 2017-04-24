package first.com.model;

import java.util.Date;

public class BfreeDTO {
	
	private int bfree_id;
	private int member_id;
	private String bfree_subject;
	private String bfree_content;
	private int bfree_count;
	private int bfree_recommend;
	private Date bfree_date;
	private String bfree_tag;

	
	
	public int getBfree_id() {
		return bfree_id;
	}

	public void setBfree_id(int bfree_id) {
		this.bfree_id = bfree_id;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getBfree_subject() {
		return bfree_subject;
	}

	public void setBfree_subject(String bfree_subject) {
		this.bfree_subject = bfree_subject;
	}

	public String getBfree_content() {
		return bfree_content;
	}

	public void setBfree_content(String bfree_content) {
		this.bfree_content = bfree_content;
	}

	public int getBfree_count() {
		return bfree_count;
	}

	public void setBfree_count(int bfree_count) {
		this.bfree_count = bfree_count;
	}

	public int getBfree_recommend() {
		return bfree_recommend;
	}

	public void setBfree_recommend(int bfree_recommend) {
		this.bfree_recommend = bfree_recommend;
	}

	public Date getBfree_date() {
		return bfree_date;
	}

	public void setBfree_date(Date bfree_date) {
		this.bfree_date = bfree_date;
	}

	public String getBfree_tag() {
		return bfree_tag;
	}

	public void setBfree_tag(String bfree_tag) {
		this.bfree_tag = bfree_tag;
	}
	
}
