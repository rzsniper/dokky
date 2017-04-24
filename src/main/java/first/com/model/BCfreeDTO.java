package first.com.model;

import java.util.Date;

public class BCfreeDTO {
	
	private int bcfree_id;
	private int bfree_id;
	private int member_id;
	private String bcfree_content;
	private Date bcfree_date;

	
	
	public int getBcfree_id() {
		return bcfree_id;
	}

	public void setBcfree_id(int bcfree_id) {
		this.bcfree_id = bcfree_id;
	}

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

	public String getBcfree_content() {
		return bcfree_content;
	}

	public void setBcfree_content(String bcfree_content) {
		this.bcfree_content = bcfree_content;
	}

	public Date getBcfree_date() {
		return bcfree_date;
	}

	public void setBcfree_date(Date bcfree_date) {
		this.bcfree_date = bcfree_date;
	}

	
}
