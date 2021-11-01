package com.profinch;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long eid;
	private String ename;
	private double salary;
	
	@ManyToMany(cascade = CascadeType.ALL )
	@JoinTable(name = "Emp_Addr", 
	joinColumns = {@JoinColumn(name = "Emp_Id")}, 
	inverseJoinColumns = {@JoinColumn(name ="Addr_Id")})
	private Set<Adderss> s=new HashSet<Adderss>();

	public long getEid() {
		return eid;
	}

	public void setEid(long eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Set<Adderss> getS() {
		return s;
	}

	public void setS(Set<Adderss> s) {
		this.s = s;
	}  
	
		

}
