package com.potential.booksearch.domain;

import com.hr.cmn.DTO;



public class RentVO extends DTO {
	
	private String bookname;
	private String writer;
	private String cateagory;
	private String userId;
	private String date;
	private String rate;
	public String getBookname() {
		return bookname;
	}
	public RentVO(String bookname, String writer, String cateagory, String userId, String date, String rate) {
		super();
		this.bookname = bookname;
		this.writer = writer;
		this.cateagory = cateagory;
		this.userId = userId;
		this.date = date;
		this.rate = rate;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getCateagory() {
		return cateagory;
	}
	public void setCateagory(String cateagory) {
		this.cateagory = cateagory;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	
	
		
}



