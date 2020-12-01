package com.student.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Response;

import com.student.util.DbConnect;
import com.student.vo.Student;



public class StudentDao implements IstudentDao{
	protected static final String FIELDS_INSERT = "sno,name,sex,major,grade,height,weight,BMI";
	// protected static final String FIELDS_RETURN ="id, " + FIELDS_INSERT;
	protected static String INSERT_SQL = "insert into stu_info (" + "sno,name,sex,major,grade,pwd" + ")" + "values (?,?,?,?,?,?)";
	protected static String SELECT_SQL = "select " + "*" + " from stu_info where sno=? and pwd=?";
	protected static String SELECT_SC_SQL="select " + "sno,name,height,weight,BMI" + " from stu_info where sno=?";
	protected static String S_SELECT_SQL="select " + "sno,name,sex,major,grade,height,weight,BMI" + " from stu_info where sno=?";
	protected static String UPDATE_SQL = "update stu_info set height=?,weight=?,BMI=? where sno=?";
	protected static String DELETE_SQL = "delete from stu_info where sno=?";
	protected static String UPDATE_PWD_SQL="update stu_info set pwd=? where sno=?";
	protected static String T_SELECT_SQL="select " + "sno,name,sex,major,grade,height,weight,BMI" + " from stu_info ";
	
	

	@Override
	public int add(Student stu) {
		Connection con = null;
		PreparedStatement prepStmt = null;
		ResultSet rs = null;
		int n = 0;
		try {
			con = DbConnect.getDBConnection();
			prepStmt = con.prepareStatement(INSERT_SQL);
			prepStmt.setInt(1,stu.getSno());
			prepStmt.setString(2, stu.getName());
			prepStmt.setString(3, stu.getSex());
			prepStmt.setString(4, stu.getMajor());
			prepStmt.setString(5, stu.getGrade());
			prepStmt.setString(6, stu.getPwd());
			n = prepStmt.executeUpdate();
		} catch (Exception e) {

			System.out.println(e.getMessage());
		} finally {
			DbConnect.closeDB(con, prepStmt, rs);
		}
		return n;
	}


	@Override
	public List<Student> showall(){
		Connection con = null;
		PreparedStatement prepStmt = null;
		ResultSet rs = null;
		List<Student> list = new ArrayList<Student>();
		con = DbConnect.getDBConnection();
		try {
			prepStmt = con.prepareStatement(T_SELECT_SQL);
			rs = prepStmt.executeQuery();
			while (rs.next()) {
				Student stu2 = new Student();
				stu2.setSno(rs.getInt(1));
				stu2.setName(rs.getString(2));
				stu2.setSex(rs.getString(3));
				stu2.setMajor(rs.getString(4));
				stu2.setGrade(rs.getString(5));
				stu2.setHeight(rs.getFloat(6));
				stu2.setWeight(rs.getFloat(7));
				stu2.setBMI(rs.getFloat(8));
				list.add(stu2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DbConnect.closeDB(con, prepStmt, rs);
		return list;
	}
	
	
	public int deleted(int sno)
	{
		Connection con = null;
		Statement prepStmt = null;
		int rs=0 ;
		con = DbConnect.getDBConnection();
		try {
			prepStmt = con.createStatement();
			rs=prepStmt.executeUpdate(DELETE_SQL+sno);
		} catch (Exception e) {
			// TODO: handle exception
		}
	return rs;
	        
	}
	
	public List<Student>  find(int sno,String pwd) {
		Connection con = null;
		PreparedStatement prepStmt = null;
		ResultSet rs = null;
		List<Student> list = new ArrayList<Student>();
		con = DbConnect.getDBConnection();
		try {
			prepStmt = con.prepareStatement(SELECT_SQL);
			prepStmt.setInt(1, sno);
			prepStmt.setString(2, pwd);
			rs = prepStmt.executeQuery();
			while (rs.next()) {
				Student stu2 = new Student();
			
				stu2.setSno(rs.getInt(1));
				stu2.setPwd(rs.getString(2));
				
				list.add(stu2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DbConnect.closeDB(con, prepStmt, rs);
		return list;
	}
   public int  update(Student stu) {
	   Connection con = null;
		PreparedStatement prepStmt = null;
		ResultSet rs = null;
		int n = 0;
		try {
			con = DbConnect.getDBConnection();
			prepStmt = con.prepareStatement(UPDATE_SQL);
	
			prepStmt.setString(2, stu.getName());
			prepStmt.setString(3, stu.getSex());
		
			prepStmt.setFloat(5, stu.getWeight());
			
			n = prepStmt.executeUpdate();
		} catch (Exception e) {

			System.out.println(e.getMessage());
		} finally {
			DbConnect.closeDB(con, prepStmt, rs);
		}
		return n;
	
}
   
@Override
public int updatepwd(int sno,String pwd) {
	Connection con = null;
	PreparedStatement prepStmt = null;
	ResultSet rs = null;
	int n = 0;
	try {
		con = DbConnect.getDBConnection();
		prepStmt = con.prepareStatement(UPDATE_PWD_SQL);
		prepStmt.setInt(2,sno);
		prepStmt.setString(1, pwd);
		
		n = prepStmt.executeUpdate();
	} catch (Exception e) {

		System.out.println(e.getMessage());
	} finally {
		DbConnect.closeDB(con, prepStmt, rs);
	}
	System.out.println(n);
	return n;
}



public int updateSC(float height,float weight,float BMI,int sno) {
	Connection con = null;
	PreparedStatement prepStmt = null;
	ResultSet rs = null;
	int n = 0;
	try {
		con = DbConnect.getDBConnection();
		prepStmt = con.prepareStatement(UPDATE_SQL);
		
		prepStmt.setFloat(1,height);
		prepStmt.setFloat(2,weight);
		prepStmt.setFloat(3,BMI);
		prepStmt.setInt(4,sno);
		
		n = prepStmt.executeUpdate();
	} catch (Exception e) {

		System.out.println(e.getMessage());
	} finally {
		DbConnect.closeDB(con, prepStmt, rs);
	}
	System.out.println(n);
	return n;
}



@Override
public int findstu(int sno, String pwd) {
	Connection con = null;
	PreparedStatement prepStmt = null;
	ResultSet rs = null;
	List<Student> list = new ArrayList<Student>();
	con = DbConnect.getDBConnection();
	int num=0;
	try {
		prepStmt = con.prepareStatement(SELECT_SQL);
		prepStmt.setInt(1, sno);
		prepStmt.setString(2, pwd);
		rs = prepStmt.executeQuery();
		
		if (rs.next()) {
			num=sno;
		}
		else num=0;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	DbConnect.closeDB(con, prepStmt, rs);
	return num;
	
}


@Override
public Student show(int sno) {
	Connection con = null;
	PreparedStatement prepStmt = null;
	ResultSet rs = null;
	Student stu = new Student();
	con = DbConnect.getDBConnection();
	try {
		prepStmt = con.prepareStatement(S_SELECT_SQL);
		prepStmt.setInt(1,sno);
		rs = prepStmt.executeQuery();
		if (rs.next()) {
		
			stu.setSno(rs.getInt(1));
			stu.setName(rs.getString(2));
			stu.setSex(rs.getString(3));
			stu.setMajor(rs.getString(4));
			stu.setGrade(rs.getString(5));
			stu.setHeight(rs.getFloat(6));
			stu.setWeight(rs.getFloat(7));
			stu.setBMI(rs.getFloat(8));
		
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	DbConnect.closeDB(con, prepStmt, rs);
	return stu;
}




}
