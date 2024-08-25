package com.factory.fact;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logic l=new Logic();
		FactoryInterface f=l.profession("doctor");
		f.print();

	}

}
