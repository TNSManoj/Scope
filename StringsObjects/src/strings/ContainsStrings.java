package strings;

public class ContainsStrings {

	public static void main(String[] args) {
		String name="what do you know about me";
		System.out.println(name.contains("do you know"));
		System.out.println(name.contains(" about me"));
		System.out.println(name.contains("manoj"));
		
		
		String s="Hello T#E#C#H#N#O#S#E#R#V#E@2.reders";
		boolean iscontains=s.contains("T#E#C#H#N#O#S#E#R#V#E");
		System.out.println(iscontains);
		System.out.println(s.contains("TECHNOSERVE"));
		
		
		
		String str="To learn java visit abc.in";
		if(str.contains("abc.in.com")) {
			System.out.println("this string contains abc.in");
		}else {
			System.out.println("result not found");
		}

	}

}
