package first.com.model;

import java.util.Date;

public class BcodeDTO {
	
	private int bcode_id;
	private int member_id;
	private String bcode_subject;
	private String bcode_content;
	private int bcode_count;
	private int bcode_recommend;
	private Date bcode_date;
	private String bcode_tag;

	
	
	public int getBcode_id() {
		return bcode_id;
	}

	public void setBcode_id(int bcode_id) {
		this.bcode_id = bcode_id;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getBcode_subject() {
		return bcode_subject;
	}

	public void setBcode_subject(String bcode_subject) {
		this.bcode_subject = bcode_subject;
	}

	public String getBcode_content() {
		return bcode_content;
	}

	public void setBcode_content(String bcode_content) {
		this.bcode_content = bcode_content;
	}

	public int getBcode_count() {
		return bcode_count;
	}

	public void setBcode_count(int bcode_count) {
		this.bcode_count = bcode_count;
	}

	public int getBcode_recommend() {
		return bcode_recommend;
	}

	public void setBcode_recommend(int bcode_recommend) {
		this.bcode_recommend = bcode_recommend;
	}

	public Date getBcode_date() {
		return bcode_date;
	}

	public void setBcode_date(Date bcode_date) {
		this.bcode_date = bcode_date;
	}

	public String getBcode_tag() {
		return bcode_tag;
	}

	public void setBcode_tag(String bcode_tag) {
		this.bcode_tag = bcode_tag;
	}

}
