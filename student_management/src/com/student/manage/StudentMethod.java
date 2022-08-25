package com.student.manage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
public class StudentMethod 
{
		public static boolean insertstudenttoDB(Student s)
		{
			boolean f = false;
			try
			{
				//jdbc code
				Connection con = CP.createc();
				String q = "insert into students(sname,sphone,scity) values(?,?,?)";
				//PreapredStatement
				PreparedStatement p = con.prepareStatement(q);
				//set values of para
				p.setString(1, s.getStudentName());
				p.setString(2, s.getStudentPhone());
				p.setString(3, s.getStudentCity());
				//execute
				p.executeUpdate();
				f = true;	
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return f;
			
		}

		public static boolean deletestudent(int userId) 
		{
			// TODO Auto-generated method stub
			boolean f = false;
			try
			{
				//jdbc code
				Connection con = CP.createc();
				String q = "delete from students where sid=?";
				//PreapredStatement
				PreparedStatement p = con.prepareStatement(q);
				//set values of para
				p.setInt(1,userId);
				//execute
				p.executeUpdate();
				f = true;	
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return f;
			
		}
		
		public static void showallstudents() 
		{
			// TODO Auto-generated method stub
			boolean f = false;
			try
			{
				//jdbc code
				Connection con = CP.createc();
				String q = "select * from students";
				//CreateStatement
				Statement s = con.createStatement();
				
				//execute
				 ResultSet set =  s.executeQuery(q);
				 while(set.next())
				 {
					 int id = set.getInt(1);
					 String name = set.getString(2);
					 String phone = set.getString(3);
					 String city = set.getString("scity");
					 
					 System.out.println("ID :" + id);
					 System.out.println("Name :" + name);
					 System.out.println("Phone :" + phone);
					 System.out.println("City :" + city);
					 System.out.println("++++++++++++++++++++++++++++++++++++");
					 
				 }
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
		}
}
