package com.cg.abstraction;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		* We cannot create object of an abstract class
		* hence, Food f=new Food(); is invalid.
		*/
		System.out.println("Creating object of carrothalwa");

		Food carrot_halwa=new CarrotHalwa();
		System.out.println("-------------------------------------------------");

		System.out.println("Creating object of doodhihalwa");

		Food doodhi_halwa=new DoodhiHawla();
		System.out.println("-------------------------------------------------");

		System.out.println("Creating object of Ice Cream");
		
		System.out.println(carrot_halwa.consume());
		/*
		* However, carrot_halwa.makeHalwa() will not work
		* because reference is of &quot;Food&quot; where

		&quot;makeHalwa()&quot;

		* is not declared
		* Hence, creating another object of CarrotHalwa

		and

		* assigning it to reference of CarrotHalwa
		*/
		System.out.println("------------------------------------------------");

		System.out.println("Creating object of CarrotHalwa using reference of CarrotHalwa");

		CarrotHalwa carrot_halwa1=new CarrotHalwa();
		carrot_halwa1.makeHalwa();
		System.out.println(carrot_halwa1.consume());

	}

}
         
          