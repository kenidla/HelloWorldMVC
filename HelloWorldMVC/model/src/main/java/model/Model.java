package model;

import java.io.*;
//import java.io.FileReader;

public class Model implements IModel {

	@Override
	public String getMessage() {
		
		String link=Model.class.getResource("message.txt").getFile();
		
		return link;
		
		
		
		// TODO Auto-generated method stub
		//return message;
	}
	
	

}
