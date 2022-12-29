package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("singleton")
public class Subject {
	@Value("#{new java.lang.String('python')}")
	private String subname;
	@Value("#{8<5 ? 500:1000}")
	private int price;
	@Value("#{T(java.lang.Math).sqrt(16)}")
	private double z;
	@Value("#{T(java.lang.Math).E}")
	private double e;
	@Value("#{8>3}")
	private boolean isActive;
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Subject [subname=" + subname + ", price=" + price + ", z=" + z + ", e=" + e + ", isActive=" + isActive
				+ "]";
	}
	
	
}
