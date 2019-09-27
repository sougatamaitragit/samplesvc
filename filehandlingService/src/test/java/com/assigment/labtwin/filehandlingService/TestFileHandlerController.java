package com.assigment.labtwin.filehandlingService;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestFileHandlerController {
	
	@LocalServerPort
    int port; 
	
	@Before
    public void setUp() { 
        RestAssured.port = port;
    }
	
	  
	 
	 
	@Test
	public void testc_getAllQuestions() {
		  when()
         .get("/file")
         .then().contentType(ContentType.JSON)
         .statusCode(200).and().assertThat().
          body("size()", equalTo(1));
	}
	

}
