package com.potential.bookapply.control;

import javafx.beans.property.StringProperty;

/**
 * @author sist
 *
 */
public class BookApplyList {

	private StringProperty title;
	private StringProperty author;
	private StringProperty publisher;
	private StringProperty pubYear;
	private StringProperty comment;
	private StringProperty status;
	/**
	 * @param title
	 * @param author
	 * @param publisher
	 * @param pubYear
	 * @param comment
	 * @param status
	 */
	public BookApplyList(StringProperty title, StringProperty author, StringProperty publisher,
			StringProperty pubYear, StringProperty comment, StringProperty status) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.pubYear = pubYear;
		this.comment = comment;
		this.status = status;
	}
	
	public StringProperty titleProperty(){
		return title;
	}
	
	public StringProperty authorProperty(){
		return author;
	}
	
	public StringProperty publisherProperty(){
		return publisher;
	}
	
	public StringProperty pubYearProperty(){
		return pubYear;
	}
	
	public StringProperty commentProperty(){
		return comment;
	}
	
	public StringProperty statusProperty(){
		return status;
	}
	
	
}
