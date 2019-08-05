package com.bridgelabz.oopsprogrameJsonUtil;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class MyJsonUtil<T>
{
   public static ObjectMapper mapper;
   static 
   {
	   mapper=new ObjectMapper();
   }
   /////////java to json
   @SuppressWarnings("unused")
 public static String javatojson(Object object) 
   {
	  String str=" ";
	  try {
		str=mapper.writeValueAsString(object);

	} catch (JsonGenerationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (JsonMappingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return str;
	  
   }
   ///////////--------json to java
   public static <T> T jsontojava(String str,Class<T> cls)
   {
	   T result=null;
	   try {
		result=mapper.readValue(str, cls);
	} catch (JsonParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (JsonMappingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return result;
	   
   }
   
   
}
