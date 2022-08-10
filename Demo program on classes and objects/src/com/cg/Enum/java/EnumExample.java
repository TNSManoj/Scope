package com.cg.Enum.java;

enum Months{
	Jan(31),Feb(28),Mar(31),Apr(30),May(31),Jun(30),Jul(31),Aug(31),Sep(30),Oct(31),Nov(30),Dec(31);
	private int days;
	Months(int days){
		this.days = days;
	}
	public int getDays() {
		return days;
	}
}

public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Days in the month of November are :"+ Months.Nov.getDays());
System.out.println("Days in the mouth of December are :"+ Months.Dec.getDays());
	}

}
