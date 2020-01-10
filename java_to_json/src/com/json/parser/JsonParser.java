package com.json.parser;

public class JsonParser {
	
	public static object mapper mapper;
	static 
	{
		mapper  = new  object mapper();
	}
	public void marshalling (student obj)
	{
		try {
			mapper.writevalue(newfile("./student.json"),obj);
		}catch(Throwable e) {
		  e.printStackTrace();	  
		}
	}

}
