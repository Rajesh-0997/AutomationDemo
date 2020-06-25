package Com.Api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileAccess 
{
	public static String key_num;
	public static String url;
	public static String token_num;
	

	public void Acees() throws IOException 
	{
Properties pro=new Properties();
FileInputStream fs=new FileInputStream("/home/qapitol/Desktop/27-5-20+WebUiAutomation/Web.Api.Test/Configuration/config.properties");
		
 	   pro.load(fs);
 	   
 	  url=pro.getProperty("Url");
 	  
 	  key_num=pro.getProperty("KEY");
 	
 	  
 	  token_num=pro.getProperty("TOKEN");
 	
 	 
 	   
	  
	   
		
	}
	

}
