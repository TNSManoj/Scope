package stringsinbuiltmethod;

public class Trim {

	public static void main(String[] args) {
		String s1="Game of";
		System.out.println(s1 + " thrones");
		System.out.println(s1.trim()+" thrones");
		//toCharArray()
		String s2="TWILIGHT SAGA";
		char[]ch =s2.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		//StartsWith()
		String s3 = "You must be the change you wish to see in the world";

		System.out.println(s3.startsWith("y"));

		System.out.println(s3.startsWith("You must"));

		System.out.println(s3.startsWith("a"));

		System.out.println(s3.startsWith("o", 1));
		//endswith()
		String s4 = "Beauty is in the eye of the beholder";

		System.out.println(s4.endsWith("r"));

		System.out.println(s4.endsWith("holder"));

		System.out.println(s4.endsWith("eye"));
		
		//format()
		String name = "CSK";

		String sf1 = String.format("%s",name);

		String sf2 = String.format("%f",32.33434);

		String sf3 = String.format("%16.12f",32.33434);

		System.out.println(sf1);

		System.out.println(sf2);

		System.out.println(sf3);

	}

}
