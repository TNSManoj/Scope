package stringsinbuiltmethod;

public class Exampleoutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Great", t = "H";

		String u = s.concat(t);

		if(u == s){

		System.out.println("Same"); }

		else{

		System.out.println("Not same"); }

		String e = s + t;

		if (e == s){

		System.out.println("Same");

		}

		else{

		System.out.println("Not same"); }
		
		//predict the output
		
		String s1 = "This is the example";

		int index = s1.indexOf("example", 10);

		System.out.println(index);

		index = s1.indexOf("example", 20);

		System.out.println(index);
		
		//predict the output
		float f = 10.05645f;

		double d = 10.02;

		String s2 = String.valueOf(f);

		String s3 = String.valueOf(d);

		System.out.println(s2);

		System.out.println(s3);
	}
}
