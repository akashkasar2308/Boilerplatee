package com.beta.replyservice;

import org.json.JSONObject;  
import org.json.JSONArray;  
public class inputstring   
{  
public static void main(String args[])   
{  
String str = "[{\"No\":\"17\",\"Name\":\"Andrew\"},{\"No\":\"18\",\"Name\":\"Peter\"}, {\"No\":\"19\",\"Name\":\"Tom\"}]";  
JSONArray array = new JSONArray(str);  
for(int i=0; i < array.length(); i++)   
{  
JSONObject object = array.getJSONObject(i);  
System.out.println(object.getString("No"));  
System.out.println(object.getString("Name"));  
}  
}  
}  