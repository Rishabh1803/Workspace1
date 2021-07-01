package com.lms.helper;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class MySQLConnection {
	
	public static Connection makeConnection() throws Exception{
		Properties properties = new Properties();
		FileInputStream fis= new FileInputStream("DBConnection.properties");
		properties.load(fis);
		
		Class.forName((String)properties.get("db.driver"));
		
		Connection connect = DriverManager.getConnection((String)properties.get("db.url"),(String)properties.get("db.username"),(String)properties.get("db.password"));
		return connect;
	}
}
