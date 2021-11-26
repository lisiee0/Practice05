package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] strArray){
       
        //메소드 내용작성
    	String print= "";
    	
    	int i= 0; 
    	do {   		
    		print= print+strArray[i];
    		i++;
    	}
    	while(i<strArray.length);
    	return print;
    }
}