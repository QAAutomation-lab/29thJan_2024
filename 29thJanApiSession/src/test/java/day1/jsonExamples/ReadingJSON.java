package day1.jsonExamples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class ReadingJSON {
	@Test
	public void jsonFileDataReading() throws FileNotFoundException, IOException, ParseException {
		//create an instance of JSONParser to parse the content of JSON file in Object class
		JSONParser jp=new JSONParser();
		//Using FileReader define the JSON file that you want to read
		FileReader fr=new FileReader(".\\src\\test\\resources\\JsonFiles\\User.json");
		//Using JSONParser reference call parse() to convert JSON file content into Object class 
		Object obj=jp.parse(fr);
		//Convert Object into JSONObject so that you can easily fetch data based on key
		JSONObject ref=(JSONObject)obj;
		
		String name=(String)ref.get("Name");
		String college=(String)ref.get("College");
		String branch=(String)ref.get("Branch");
		
		System.out.println(name);
		System.out.println(college);
		System.out.println(branch);
	}
}
