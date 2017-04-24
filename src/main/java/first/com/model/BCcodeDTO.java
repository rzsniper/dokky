package first.com.model;

import java.util.Date;

public class BCcodeDTO {
	
	private int bccode_id;
	private int bcode_id;
	private int member_id;
	private String bccode_content;
	private Date bccode_date;

	
	
	public int getBccode_id() {
		return bccode_id;
	}

	public void setBccode_id(int bccode_id) {
		this.bccode_id = bccode_id;
	}

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

	public String getBccode_content() {
		return bccode_content;
	}

	public void setBccode_content(String bccode_content) {
		this.bccode_content = bccode_content;
	}

	public Date getBccode_date() {
		return bccode_date;
	}

	public void setBccode_date(Date bccode_date) {
		this.bccode_date = bccode_date;
	}
	
}
