package com.capg.beans;

public class Manager extends Employee {
	private String loaction;
	private float pf;
	private float hra;
	@Override
	public void empInformation() {
		System.out.println("Employee Information\n");
		System.out.println("\temp id"+getId());
		System.out.println("\temp Name"+getName());
		System.out.println("\temp Salary"+getSalary());
		System.out.println("\temp Pf"+getPf());
		System.out.println("\temp Hra"+getHra());
		System.out.println("\temp gross salary "+(getSalary()+getHra()-getPf()));
		
		
		
	}
	public String getLoaction() {
		return loaction;
	}
	public void setLoaction(String loaction) {
		this.loaction = loaction;
	}
	public float getPf() {
		return pf;
	}
	public void setPf(float pf) {
		this.pf = pf;
	}
	public float getHra() {
		return hra;
	}
	public void setHra(float hra) {
		this.hra = hra;
	}
	
	

}
