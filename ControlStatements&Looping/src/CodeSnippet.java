
public class CodeSnippet {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			System.out.println("before breaking=" + i);
			if(i==6)
			break;
			System.out.println("after breaking=" + i);
			
		}
		System.out.println("for loop terminated.");

	}

}
