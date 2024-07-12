package day1.jsonExamples;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.testng.annotations.Test;

public class Example1 {

	@Test
	public void workingWithJSONObject() {
		
		JSONObject ref=new JSONObject();
		ref.put("Name", "Shailesh");
		ref.put("Number", "9764975157");
		ref.put("City", "Pune");
		ref.put("Company", "IBM");
		System.out.println("JSONObject elements are: "+ref);
		
		System.out.println("Get value of 'Company' key: "+ref.get("Company"));
		System.out.println(ref.keySet());
		System.out.println(ref.values());
	}
	
	@Test
	public void workingMapIntoJSON() {
		Map ref=new HashMap();
		ref.put("Name", "Shailesh");
		ref.put("Number", "9764975157");
		ref.put("City", "Pune");
		ref.put("Company", "IBM");
		System.out.println("HashMap elements are: "+ref);
		//converting Map into JSON String
		String jsonText=JSONValue.toJSONString(ref);
		System.out.println("HashMap converted into JSON String: "+jsonText);
	}
	
	@Test
	public void stringIntoJSONObject() {
		String str="{\"Company\":\"IBM\",\"Number\":\"9764975157\",\"City\":\"Pune\",\"Name\":\"Shailesh\"}";
		
		//Convert String into Object first
		Object obj=JSONValue.parse(str);
		JSONObject jsonObject=(JSONObject)obj;
		System.out.println("JSONObject elements are: "+jsonObject);
		
//		Object obj1=jsonObject.get("Name");
//		String name=(String)obj1;//downcasting
//		System.out.println("Name: "+name);
				//or
		String name=(String)jsonObject.get("Name");
		System.out.println("Name: "+name);
	}
}
