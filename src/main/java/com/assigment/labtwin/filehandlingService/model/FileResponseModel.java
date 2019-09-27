package com.assigment.labtwin.filehandlingService.model;

import java.util.Date;

public class FileResponseModel {
	
	private String fileName;
	private Date dateLastUploaded;
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Date getDateLastUploaded() {
		return dateLastUploaded;
	}
	public void setDateLastUploaded(Date dateLastUploaded) {
		this.dateLastUploaded = dateLastUploaded;
	}
	

}
