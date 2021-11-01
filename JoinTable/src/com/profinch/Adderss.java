package com.profinch;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Adderss {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	private String areaname;
	private String cityname;
	
	@ManyToMany(cascade = CascadeType.ALL , mappedBy = "s" , fetch = FetchType.EAGER)
	private List<Employee> Em=new ArrayList<Employee>();
	
	

	@Override
	public String toString() {
		return "Adderss [aid=" + aid + ", areaname=" + areaname + ", cityname=" + cityname + ", Em=" + Em + "]";
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAreaname() {
		return areaname;
	}

	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public List<Employee> getEm() {
		return Em;
	}

	public void setEm(List<Employee> em) {
		Em = em;
	}
	
	
	

}
