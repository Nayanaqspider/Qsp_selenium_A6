package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DataBase 
{
@Test
public void Data() throws SQLException
{
String usn="root";
String psw="root";
String url="jdbc:mysql://localhost:3306/AdvanceSelenium";
Connection connection = DriverManager.getConnection(url, usn, psw);
Statement quary = connection.createStatement();
boolean r = quary.execute("select * from StudentDetails");
ResultSet res = quary.executeQuery("select * from StudentDetails");

/*res.next();
String name1 = res.getString("Names");
System.out.println(name1);
res.next();
String name2 = res.getString("Names");
System.out.println(name2);*/

while(res.next())
{
	String name = res.getString("Names");
	System.out.println(name);
}
	
}
}

