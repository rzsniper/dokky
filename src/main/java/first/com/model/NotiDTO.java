package first.com.model;

import java.util.Date;

public class NotiDTO {
	
	private int noti_id;
	private int member_id;//댓글달린 게시판의 작성자 ID
	private String noti_type;//어느 게시판인지 구분할 댓글 칼럼
	private int noti_sender_id;//댓글 작성한 회원 ID
	private String noti_subject;//알림 메세지
	private String noti_url;//댓글이 달렸을 떄의 해당 게시판 url
	private Date noti_date;
	private int noti_typeid;
	private String noti_content;
	private int noti_confirm;//받은 알림의 개수

	
	
	public int getNoti_id() {
		return noti_id;
	}

	public void setNoti_id(int noti_id) {
		this.noti_id = noti_id;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getNoti_type() {
		return noti_type;
	}

	public void setNoti_type(String noti_type) {
		this.noti_type = noti_type;
	}

	public int getNoti_sender_id() {
		return noti_sender_id;
	}

	public void setNoti_sender_id(int noti_sender_id) {
		this.noti_sender_id = noti_sender_id;
	}

	public String getNoti_subject() {
		return noti_subject;
	}

	public void setNoti_subject(String noti_subject) {
		this.noti_subject = noti_subject;
	}

	public String getNoti_url() {
		return noti_url;
	}

	public void setNoti_url(String noti_url) {
		this.noti_url = noti_url;
	}

	public Date getNoti_date() {
		return noti_date;
	}

	public void setNoti_date(Date noti_date) {
		this.noti_date = noti_date;
	}

	public int getNoti_typeid() {
		return noti_typeid;
	}

	public void setNoti_typeid(int noti_typeid) {
		this.noti_typeid = noti_typeid;
	}

	public String getNoti_content() {
		return noti_content;
	}

	public void setNoti_content(String noti_content) {
		this.noti_content = noti_content;
	}

	public int getNoti_confirm() {
		return noti_confirm;
	}

	public void setNoti_confirm(int noti_confirm) {
		this.noti_confirm = noti_confirm;
	}
	
}
