package API;

import org.testng.annotations.*;
import org.testng.Assert;
import org.testng.asserts.*;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class webService {
	
	@Test
	public void GetWeatherDetails() throws Exception
	{
		//SET the REST API Endpoint or Specify the base URL to RESTful web service
		RestAssured.baseURI = "https://demoqa.com/utilities/weather/city";
		//http://demoqa.com/utilities/weather/city
		
		//Get the RequestSpesification of the request that you want to sent
		//to the server. The server is specified by the BaseURI that we have
		//specified in the above step
		// Create an HTTP Request for this API
		RequestSpecification httpRequest = RestAssured.given();
		
		//Make a request to the server by specifying the method Type and the method URL
		//This will return the Response from the server. Store the response in a variable.
		//Lets call the API now
		Response response = httpRequest.request(Method.GET,"/London");
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode /*Actual Value*/, 200 /*Expected Value*/, "Correct status code returned");
		
		//Now let us print the body of the message to see what response
		//we have received from the server
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is => "+responseBody);
	}
	
	@Test
	public void GetWeatherDetailsInvaliCity()
	{
		RestAssured.baseURI = "https://demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET,"/Blue");
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode /*Actual Value*/, 200 /*Expected Value*/, "Correct status code returned");
	}
	
	@Test
	public void GetWeatherStatusLine()
	{
		RestAssured.baseURI = "https://demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET,"/London");
		
		//Get the status line from the Response and store it in a variable called statusLine
		String statusLine = response.getStatusLine();
		Assert.assertEquals(statusLine /*actual value*/, "HTTP/1.1 200 OK" /*expected value*/,"Correct status line return");

	}
	
	@Test
	public void GetWeatherHeaders()
	{
		RestAssured.baseURI = "https://demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET,"/London");
	
		//Reader header of a give name. In this line we will get
		//Header named Content-Type
		String contentType = response.header("Content-Type");
		System.out.println("Content-Type value: "+ contentType);
	
		//Reader header of a give name. In this line we will get
		//Header named Server
		String xyz = response.header("Server");
		System.out.println("Server value: " + xyz);
	
		//Reader header of a give name. In this line we will get
		//Header named responseDate
		String responseDate = response.header("Date");
		System.out.println("Date: " + responseDate);
	
		//Reader header of a give name. In this line we will get
		//Header named C
		String encoding = response.header("Content-Encoding");
		System.out.println("Content-Encoding: " + encoding);
	
		//Reader header of a give name. In this line we will get
		//Header named Content-Length
		String conLength = response.header("Content-Length");
		System.out.println("Content-Length: " + conLength);
	}

	@Test
	public void IteratingOverHeaders()
	{
		RestAssured.baseURI = "https://demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET,"/London");
	
		//Get all the headers.Return value is of type Headers
		//Headers class implements an iterable interface, hence we
		//can apply an advance for loop to go through all Headers
		//as shown in the code below
		Headers allHeaders = response.headers();
	
		//Iterate over all the Headers
		for(Header header : allHeaders)
		{
			System.out.println("Key: " + header.getName() + "Value: " + header.getValue());
		}
	}
}

