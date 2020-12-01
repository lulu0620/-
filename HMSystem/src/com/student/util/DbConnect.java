package com.student.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {
	private static String driverStr="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String connStr;
    private static String dbusername="sa";
    private static String dbpassword="123456"; 
    private static Connection conn=null;


    public static Connection getDBConnection(){
	 
connStr="jdbc:sqlserver://localhost:1433;databaseName=HMSystem";
	    try{
		     Class.forName(driverStr);
		   conn = DriverManager.getConnection(connStr,dbusername,dbpassword);
		   System.out.println("数据库连接成功！");
		return conn;
	}catch(Exception ex){System.out.println("无法同数据库建立连接！");}
	    return null;
}

    
	   
    public static void closeDB(Connection con,PreparedStatement  pstm, ResultSet rs){
 	   try{
 		   if(rs!=null) rs.close(); 
 		   if(pstm!=null) pstm.close();
		   if(con!=null) con.close();				 
	   }catch (SQLException e) {				
			e.printStackTrace();			
	   }
	}
}
