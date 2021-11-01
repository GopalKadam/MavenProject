package com.profinch;

import org.hibernate.Session;

public class Test {
	
	public static void main(String[] args) {
//		
//		Employee e = new Employee();
//		e.setEname("Shital");
//		e.setSalary(70000);
//		
//		
//		Employee e1 = new Employee();
//		e1.setEname("Divya");
//		e1.setSalary(120000);
//		
//		
//		Employee e2 = new Employee();
//		e2.setEname("Ram");
//		e2.setSalary(70000);
//		
//		Adderss  a =new Adderss();
//		a.setAreaname("Nk");
//		a.setCityname("Nashik");
//		a.getEm().add(e);
//		
//		Adderss a1 = new Adderss();
//		a1.setAreaname("Manya");
//		a1.setCityname("Dhule");
//		a.getEm().add(e1);
//		
//		e.getS().add(a);
//		e1.getS().add(a1);
//		e1.getS().add(a1);
		
		Session session=HibernateUlti.getSessionFactory().openSession();
		
		Adderss ad=session.load(Adderss.class, 6);
		System.out.println(ad.getAid());
		System.out.println(ad.getAreaname());
		System.out.println(ad.getCityname());
		System.out.println(ad.getEm().size());
		
		
		
		System.out.println("+++++++++++++++++++++++++++++++");
		
//		Employee emp=session.get(Employee.class, 1);
//		System.out.println(emp.getEid());
//		System.out.println(emp.getEname());
//		System.out.println(emp.getSalary());
		
		//System.out.println(emp.getS().toString());
		
//		session.save(e);
//		session.beginTransaction().commit();
//		
//		session.save(e1);
//		session.beginTransaction().commit();
		
//		session.save(a1);
//		session.beginTransaction().commit();
		}

}
