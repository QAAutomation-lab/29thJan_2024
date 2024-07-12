package day1.jsonExamples;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Example2 {
	@Test
	public void workingWithJSONArray() {
		JSONArray jsonArray=new JSONArray();
		jsonArray.add("Pune");
		jsonArray.add(123);
		jsonArray.add("Mumbai");
		System.out.println("JSON array elements are: "+jsonArray);
	}
	
	@Test
	public void addingJSONObjectIntoJSONArray() {
		JSONObject ref1=new JSONObject();
		ref1.put("Name", "Shailesh");
		ref1.put("Number", "9764975157");
		ref1.put("City", "Pune");
		ref1.put("Company", "IBM");
		System.out.println("JSONObject elements are: "+ref1);
		
		JSONObject ref2=new JSONObject();
		ref2.put("Name", "Aman");
		ref2.put("Number", "9764970051");
		ref2.put("City", "Bangalore");
		ref2.put("Company", "Accenture");
		System.out.println("JSONObject elements are: "+ref2);
		
		JSONArray arr=new JSONArray();
		arr.add(ref1);
		arr.add(ref2);
		System.out.println("JSONArray elements are: "+arr);
	}
}
