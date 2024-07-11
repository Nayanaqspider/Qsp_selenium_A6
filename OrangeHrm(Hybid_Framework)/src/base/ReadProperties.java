package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties implements applicationConstants 
{
	public Properties pro;// to access this create object
	public FileInputStream fis;
	public String url;
	public String usn;
	public String psw;
	
	//public static Properties pro; // to access this no need to create object because it is static so use class.variablename 

	public ReadProperties() throws IOException 
	{
		fis = new FileInputStream(test_url_path);
		pro = new Properties();
		pro.load(fis);
	}

	public  String m1() 
	{
         url = pro.getProperty("testurl");
        return url;
	}
	
	public String m2()
	{
	 usn = pro.getProperty("usn_1");
	return usn;
	}
	
	public String m3()
	{
	 psw = pro.getProperty("psw_1");
	return psw;
	}
}


