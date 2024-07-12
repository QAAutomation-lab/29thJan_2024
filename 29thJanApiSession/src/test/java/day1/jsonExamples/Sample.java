package day1.jsonExamples;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public void testJsonObjectExample1() {
		JSONObject obj=new JSONObject();
		obj.put("name", "Pune");
		obj.put("age", 27);
		obj.put("salary",65000);
		System.out.println("Json Object is: \n\t"+obj);
	}
	
	@Test
	public void testJsonObjectExample2() {
		Map obj=new HashMap();
		obj.put("name", "Pune");
		obj.put("age", 27);
		obj.put("salary",65000);
		System.out.println("MAP Object is: \n\t"+obj);
		
		String jsonFormatText=JSONValue.toJSONString(obj);
		System.out.println("Json Text:\n\t"+jsonFormatText);
		
		JSONObject ref=(JSONObject)JSONValue.parse(jsonFormatText);
		System.out.println("JSON object from MAP: \n\t"+ref);
	}
	@Test
	public void testJsonArrayExample3() {
		JSONArray ar=new JSONArray();
		ar.add("Pune");
		ar.add(27);
		ar.add(65000);
		System.out.println("JSON Array: \n\t"+ar);
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}
	
	@Test
	public void stringToJson() {
				
		String s1="{\"name\":\"John\", \"age\":31, \"city\":\"New York\"}";
		//convert String into Object class
		Object obj=JSONValue.parse(s1);
		//Convert Object class into JSONObject
		JSONObject ref=(JSONObject)obj;
		System.out.println("JSON Object: \n\t"+ref);
		//get values from JSONObject and type cast them into required type
		String name=(String)ref.get("name");
		long age=(Long)ref.get("age");
		String city=(String)ref.get("city");
		System.out.println(name);
		System.out.println(age);
		System.out.println(city);
	}
}
