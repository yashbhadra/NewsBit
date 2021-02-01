package model;

import java.sql.Date;

public class Feed {
	String title;
	String link;
	String description;
	Date date;
	Feed(String title,String link,String description,Date date){
		this.title=title;
		this.link=link;
		this.description=description;
		this.date=date;
	}
	String getTitle() {
		return this.title;
	}
	void setTitle(String title) {
		this.title=title;
	}
	String getLink() {
		return this.link;
	}
	void setLink(String link) {
		this.link=link;
	}
	String getDescription() {
		return this.description;
	}
	void setDescription(String description) {
		this.description=description;
	}
	Date getDate() {
		return this.date;
	}
	void setDate(Date date) {
		this.date=date;
	}

}
