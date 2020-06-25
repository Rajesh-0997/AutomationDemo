package Com.Api.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;

public class DeleteandUpdates 
{
	public static void DeleteBoard()
	{
		RestAssured.baseURI= "https://trello.com/";
		
		String response1=	given().log().all()
				.queryParam("key", "9b7ff14321e912a01005a0908f4f9911")
				.queryParam("token","d3ce0f8729b15a5cd931c39881f9cc5f6dac23f701b9234b044dfd886bba2993" )
				.header("Content-Type","application/json").when().delete("/1/boards/5edf3602fa030c57077747eb")
				.then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(response1);
	}
	
	public static void DeleteList()
	{

		String response2=	given().log().all()
				.queryParam("key", "9b7ff14321e912a01005a0908f4f9911")
				.queryParam("token","d3ce0f8729b15a5cd931c39881f9cc5f6dac23f701b9234b044dfd886bba2993" )
				.queryParam("name", "Testing")
				.header("Content-Type","application/json").when().put("/1/lists/5edf37a17eefa93f109acb9f")
				.then().assertThat().statusCode(200).extract().response().asString();
		System.out.println(response2);
			
	}
	
	public static void DeleteCard()
	{
		String response3=	given().log().all()
				.queryParam("key", "9b7ff14321e912a01005a0908f4f9911")
				.queryParam("token","d3ce0f8729b15a5cd931c39881f9cc5f6dac23f701b9234b044dfd886bba2993" )
				.header("Content-Type","application/json").when().delete("/1/boards/5edf3602fa030c57077747eb")
				.then().assertThat().statusCode(200).extract().response().asString();
		System.out.println(response3);
		
	}
	
	public static void Emoji()
	{
		
		
		
	}

}
