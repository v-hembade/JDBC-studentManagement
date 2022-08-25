
package mypakage;
import com.student.manage.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class start 
{

	public static void main(String[] args)throws IOException{
		   // Creates an array of character
		    System.out.println("Welcome to Student Management App");
		    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		    while(true)
		    {
		    	System.out.println("Press 1 to add Student");
		    	System.out.println("Press 2 to delete Student");
		    	System.out.println("Press 3 to display Student");
		    	System.out.println("press 4 to exit app");
		    	System.out.println("Please enter your choice:");
		    	int c = Integer.parseInt(br.readLine());
		    	if(c==1)
		    	{
		    		//add student
		    		System.out.println("Enter student name");
		    		String name = br.readLine();
		    		
		    		System.out.println("Enter student city");
		    		String city = br.readLine();
		    		
		    		System.out.println("Enter student phone");
		    		String phone = br.readLine();
		    		
		    		//create student object
		    		Student s = new Student(name,phone,city);
		    		boolean result = StudentMethod.insertstudenttoDB(s);
		    		if(result)
		    		{
		    			System.out.println("user added succesfully");
		    		}
		    		else
		    		{
		    			System.out.println("user not added");
		    		}
		    			  
		    	}
		    	else if(c==2)
		    	{
		    		System.out.println("enter user id of student to delete");
		    		int userId = Integer.parseInt(br.readLine());
		    		boolean result = StudentMethod.deletestudent(userId);
		    		
		    		if(result)
		    		{
		    			System.out.println("user deleted succesfully");
		    		}
		    		else
		    		{
		    			System.out.println("user not deleted");
		    		}
		    	}
		    	else if(c==3)
		    	{
		    		StudentMethod.showallstudents();
		    	}
		    	else if(c==4)
		    	{
		    		break;
		    	}
		    	else
		    	{
		    		
		    	}
		    }
			System.out.println("THank you for using Application...........");
			System.out.println("See you Soon......");
		
	}

}
