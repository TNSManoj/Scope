
public class Company {
	String name;

	public static void main(String[] args) {
		Company s1=new Company();
		Company s2=s1;
		s1.name="C2TC";
		s1=null;
		System.out.println(s2.name);
		new Company();
		Company c3=new Company();
		c3.name="C2TC";
		System.out.println(c3.name);

	}

}
