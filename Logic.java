package com.factory.fact;

public class Logic {
	public FactoryInterface profession(String s) {
		if(s==null) {
			return null;
		}
		if(s.equalsIgnoreCase("Doctor")){
			return new Doctor();
		}
		if(s.equalsIgnoreCase("Student")){
			return new Student();
		}
		if(s.equalsIgnoreCase("Teacher")){
			return new Teacher();
		}
		
		return null;
	}

}
