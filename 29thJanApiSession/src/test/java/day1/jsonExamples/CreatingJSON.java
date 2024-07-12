package day1.jsonExamples;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class CreatingJSON {
	@Test
	public void testCase() {
		 //First Employee
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstName", "Lokesh");
        employeeDetails.put("lastName", "Gupta");
        employeeDetails.put("website", "howtodoinjava.com");        
       System.out.println("Employee Details: \n\t"+employeeDetails);
        
        JSONObject employeeObject = new JSONObject(); 
        employeeObject.put("employee", employeeDetails);
        System.out.println("Employee Object: \n\t"+employeeObject);
         
        //Second Employee
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName", "Brian");
        employeeDetails2.put("lastName", "Schultz");
        employeeDetails2.put("website", "example.com");
        System.out.println("Employee Details2: \n\t"+employeeDetails2);
         
        JSONObject employeeObject2 = new JSONObject(); 
        employeeObject2.put("employee", employeeDetails2);
        System.out.println("Employee Object: \n\t"+employeeObject2);
         
        //Add employees to list
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);
        
        System.out.println("JSON Array :\n\t\t"+employeeList);
         
        //Write JSON file
        try  {
        	FileWriter file = new FileWriter(".\\src\\test\\resources\\JsonFiles\\employees.json");
            //We can write any JSONArray or JSONObject instance to the file
            file.write(employeeList.toJSONString()); 
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("JOSN file created and JSON array valued inserted in it........");
	}
}
