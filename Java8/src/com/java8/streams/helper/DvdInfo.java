package com.java8.streams.helper;

public class DvdInfo {
	
	String title;
	String genre;
	String leadActor;
	
	public DvdInfo(String title, String genre, String leadActor) {
		this.title = title;
		this.leadActor = leadActor;
		this.genre = genre;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLeadActor() {
		return leadActor;
	}
	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
	
	@Override
	public String toString() {		
		return  title +" - "+genre+" - "+leadActor;
	}
	

}
