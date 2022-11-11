package com.srihari.hibdemo1;

import java.util.Date; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_table_4")
public class Employee {

	@Id
	@Column(name="student_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer studentId;
	
	@Column(name="student_name",length=100,nullable=false)
	private String studentName;
	
	@Column(name="student_dept",unique=false)
	private String studentDept;
	
	@Column(name="date_of_joing")
	private Date doj;
	
	@Column(name="Total_marks")
	private Double totalMarks;
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentDept() {
		return studentDept;
	}
	public void setStudentDept(String studentDept) {
		this.studentDept = studentDept;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Double getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(Double totalMarks) {
		this.totalMarks = totalMarks;
	}
}
