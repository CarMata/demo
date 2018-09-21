package com.demo.ea.model;

import java.util.Date;

public class TestModel {
	private Date date;
	private String description;
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date2) {
		this.date = date2;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "respponse [date=" + date + ", description=" + description + "]";
	}	
}
