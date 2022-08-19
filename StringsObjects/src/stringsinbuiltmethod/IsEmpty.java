package stringsinbuiltmethod;

public class IsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "";

		String s2 = "java";

		System.out.println(s1.isEmpty());

		System.out.println(s2.isEmpty());
		
		
		//join()
		String joinString1=String.join("","welcome","to","jurassic","world");

		System.out.println(joinString1);
		
		//Valueof()
	
			int value = 30;

			String s3 = String.valueOf(value);

			System.out.println(s3 + 10);
			
			//predict the output
			String s4 = "";

			String s5 = "Wonderla";

			if(s4.length()==0 || s4.isEmpty())

			System.out.println("s4 is empty");

			else System.out.println("s4");

			if(s5.length() == 0 || s5.isEmpty())

			System.out.println("s5 is empty");

			else System.out.println(s5);

	}

}
