package classesandobjects.java;

public class Company {
	String name;

	public static void main(String[] args) {
		Company c = new Company();
		Company c1=c;
		c1.name ="C2TC";
		
		
		c=null;
		System.out.println(c.name);
	}
}
		/*Company c1 = new Company();
		c1.name = "C2TC";
		Company c2 = c1;
		c1 = null;
		System.out.println(c2.name);
		new Company();
		Company c3 = null;
		c3.name = "C2TC";
		System.out.println(c3.name);}}*/

	


