package com.teacher.Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.student.util.DbConnect;
import com.student.vo.Student;

public class TeacherDao implements IsteacherDao{
	protected static String SELECT_SQL = "select " + "*" + " from teacher_info where Tsno=? and Tpwd=?";
	@Override
	public int findteacher(int T_sno, String T_pwd) {
		Connection con = null;
		PreparedStatement prepStmt = null;
		ResultSet rs = null;
		List<Student> list = new ArrayList<Student>();
		con = DbConnect.getDBConnection();
		int num=0;
		try {
			prepStmt = con.prepareStatement(SELECT_SQL);
			prepStmt.setInt(1, T_sno);
			prepStmt.setString(2, T_pwd);
			rs = prepStmt.executeQuery();
			
			if (rs.next()) {
				num=T_sno;
			}
			else num=0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DbConnect.closeDB(con, prepStmt, rs);
		return num;
		
	}

}
