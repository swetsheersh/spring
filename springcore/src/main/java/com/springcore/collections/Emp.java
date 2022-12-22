package com.springcore.collections;

import java.util.Set;
import java.util.Map;
import java.util.Properties;
import java.util.List;


public class Emp {
	private String name;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String,String> courses;
	private Properties props;
	
	//geter_seter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}
	
	
	//constructor using field
	
	public Emp(String name, List<String> phones, Set<String> addresses, Map<String, String> courses, Properties props) {
		super();
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
		this.props = props;
	}
	
	
	//constructor using superclass

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
