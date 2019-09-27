package com.assigment.labtwin.filehandlingService.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.assigment.labtwin.filehandlingService.model.FileResponseModel;

/**
 * This controller exposes REST Services for handling Files
 * @author Sougata Maitra
 *
 */
@RestController
public class FileHalnderController {
	
	@GetMapping(value="/file",produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(HttpStatus.OK)
	public  List<FileResponseModel>   getAllFile()  {
		List<FileResponseModel> fileList = new ArrayList<FileResponseModel>();
		FileResponseModel fileResponseModel = new FileResponseModel();
		fileResponseModel.setFileName("SampleFile");
		fileResponseModel.setDateLastUploaded(new Date());
		fileList.add(fileResponseModel);
		return fileList;
		
	} 

}
