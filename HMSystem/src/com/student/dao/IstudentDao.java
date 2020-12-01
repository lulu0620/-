package com.student.dao;

import java.util.List;

import com.student.vo.Student;


public interface IstudentDao {

	public int add(Student stu);
	
	public List<Student> showall();
	public int deleted(int sno);
	public List<Student> find(int sno,String pwd); 
	public int findstu(int sno,String pwd);
	public int updateSC(float height,float weight,float BMI,int sno);
	public int updatepwd(int sno,String pwd);
	public Student show(int sno);

	
	
}