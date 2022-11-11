package com.srihari.hibAss;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="HibernateAss")
@DynamicUpdate
public class MainFile {
	@Id
	
	@Column(name="cust_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer custId;

	@Column(name="cust_name",length=100,nullable=false)
	private String custName;
	
	@Column(name="Cust_loc")
	private String CustLoc;


	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustLoc() {
		return CustLoc;
	}

	public void setCustLoc(String custLoc) {
		CustLoc = custLoc;
	}

	@Override
	public String toString() {
		return "MainFile [custId=" + custId + ", custName=" + custName + ", CustLoc=" + CustLoc + "]";
	}
	
	
}
