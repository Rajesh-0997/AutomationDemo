package Com.Api.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BasicsTest 
{
	
	public static void CraeteBoard()
	{
// validate if Add Place API is workimg as expected 
		//Add place-> Update Place with New Address -> Get Place to validate if New address is present in response
		
		//given - all input details 
		//when - Submit the API -resource,http method
		//Then - validate the response
		
//--------------------------------------------------------------------------------------------------------------		
		RestAssured.baseURI= "https://trello.com/";
		
		//To create a Board
	     String response=	given().log().all().queryParam("name", "Qapitol_QA")
		.queryParam("key", "9b7ff14321e912a01005a0908f4f9911")
		.queryParam("token","d3ce0f8729b15a5cd931c39881f9cc5f6dac23f701b9234b044dfd886bba2993" )
		.header("Content-Type","application/json").when().post("/1/boards/")
		.then().assertThat().statusCode(200).body("name", equalTo("Qapitol_QA"))
		.header("Connection", "keep-alive").extract().response().asString();
	
	    System.out.println(response);
	    
	    JsonPath js=new JsonPath(response);//for parsing json
       	String IdBorad=js.getString("id");
	
	    System.out.println("perticular place id is:"+IdBorad);
	
System.out.println("-------------------------------------------------------------------------------------------------");
	
}
//------------------------------------------------------------------------------------------------------------	
	public static void CreateCheckList()
	{
		RestAssured.baseURI= "https://trello.com/";
		
	String response1=	given().log().all().queryParam("name", "IT Department")
		.queryParam("idBoard","5edf59b829f53773d0d248b7")
		.queryParam("key", "9b7ff14321e912a01005a0908f4f9911")
		.queryParam("token", "d3ce0f8729b15a5cd931c39881f9cc5f6dac23f701b9234b044dfd886bba2993")
		.header("Content-Type","application/json").when().post("/1/lists/")
		.then().log().all().assertThat().statusCode(200).body("idBoard", equalTo("5edf59b829f53773d0d248b7"))
		.header("Connection", "keep-alive").extract().response().asString();
	
	System.out.println(response1);
	}
	
//----------------------------------------------------------------------------------------------------------	
	public static void CreateNewCard()
	{
		String response2=given().log().all().queryParam("name", "Sample")
		.queryParam("idList","5edf5a0ff001f373494b28ac")
		.queryParam("key", "9b7ff14321e912a01005a0908f4f9911")
		.queryParam("token", "d3ce0f8729b15a5cd931c39881f9cc5f6dac23f701b9234b044dfd886bba2993")
		.header("Content-Type","application/json").when().post(" /1/cards/")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		  System.out.println(response2);
			
	}
//-----------------------------------------------------------------------------------------------------------	
	public static void GetABoard()
	{
		String response3=given().log().all()	
				.queryParam("key", "9b7ff14321e912a01005a0908f4f9911")
				.queryParam("token", "d3ce0f8729b15a5cd931c39881f9cc5f6dac23f701b9234b044dfd886bba2993")
				.header("Content-Type","application/json").when().get("/1/boards/5edf8f3809b286850818e48d")
				.then().log().all().assertThat().header("Connection", "keep-alive").extract().response().asString()
				;
		          System.out.println(response3);
	}
//------------------------------------------------------------------------------------------------------------	
	public static void GetFieldOnBoard()
	{
		String response4=given().log().all()	
				.queryParam("key", "9b7ff14321e912a01005a0908f4f9911")
				.queryParam("token", "d3ce0f8729b15a5cd931c39881f9cc5f6dac23f701b9234b044dfd886bba2993")
				.header("Content-Type","application/json").when().get("/1/boards/5edf8f3809b286850818e48d/shortLink")
				.then().log().all().assertThat().statusCode(200).body("_value", equalTo("gMKlwvSv")).header("Connection", "keep-alive").extract().response().asString()
				;
		          System.out.println(response4);
	}
//-------------------------------------------------------------------------------------------------------------	
	public static void GetActionsBoard()
	{
		String response5=given().log().all()	
				.queryParam("key", "9b7ff14321e912a01005a0908f4f9911")
				.queryParam("token", "d3ce0f8729b15a5cd931c39881f9cc5f6dac23f701b9234b044dfd886bba2993")
				.header("Content-Type","application/json").when().get("/1/boards/5edf8f3809b286850818e48d/actions")
				.then().log().all().assertThat().statusCode(200).header("Connection", "keep-alive").extract().response().asString();
		
		 System.out.println(response5);
	}
//---------------------------------------------------------------------------------------------------	
	public static void Emoji()
	{
		String response6=given().log().all().queryParam("locale", "false")	
				.queryParam("key", "9b7ff14321e912a01005a0908f4f9911")
				.queryParam("token", "d3ce0f8729b15a5cd931c39881f9cc5f6dac23f701b9234b044dfd886bba2993")
				.header("Content-Type","application/json").when().get("/1/emoji")
				.then().log().all().assertThat().statusCode(200).extract().response().asString();
		         System.out.println(response6);
	}
//-----------------------------------------------------------------------------------------------------------------	
	
	public static void EnablePowerUps()
	{
		String response7=given().log().all().queryParam("value", "calendar")	
				.queryParam("key", "9b7ff14321e912a01005a0908f4f9911")
				.queryParam("token", "d3ce0f8729b15a5cd931c39881f9cc5f6dac23f701b9234b044dfd886bba2993")
				.header("Content-Type","application/json").when().post("/1/boards/5edfabcc4aab8f13d36887f1/powerUps")
				.then().log().all().assertThat().body("message", equalTo("Gone")).extract().response().asString();
		         System.out.println(response7);
	}

}