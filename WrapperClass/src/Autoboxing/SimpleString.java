package Autoboxing;

public class SimpleString {

	public static void main(String[] args) {
		char ch[]= {'J','A','V','A'};
		String s1=new String(ch);
		String s2=new String(s1);
		System.out.println(s1);
		System.out.println(s2);
		String longstr="This could have been " + "a very long line that would have "+ "Wrapped around. But string concatenation "+ "prevents this.";
		System.out.println(longstr);
	

	}

}
