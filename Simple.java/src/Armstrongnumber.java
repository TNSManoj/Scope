

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int n=155,temp=n,r,sum=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum + r*r*r;
		}
          if(temp==sum) {
        	  System.out.println("its is an amstrongnumber");
          }else {
        	  System.out.println("it is not an amstrongnumber");
          }
	}

}
