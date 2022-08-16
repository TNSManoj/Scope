
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n=123,r,s=0;
          int t=n;
          while(n>0) {
        	  r=n%10;
        	  n=n/10;
        	  s=s*10+r;
          }
          if(s==t) {
          System.out.println(s+ "it is a palindrome");
          }else {
        	  System.out.println(s+ "it is not a palindrome");
          }
	}

}
