package strings;

public class EqualsCase {

	public static void main(String[] args) {
		String str="the walking dead";
		String str1="the walking dead";
		String str2="THE WALKING DEAD";
		String str3="the west weeds";
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.equalsIgnoreCase(str2));
		System.out.println(str.equalsIgnoreCase(str3));

	}

}
