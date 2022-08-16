
public class Primenumber {

		public static void main(String[] arr) {
			int a=0,b=0;
			int n=4;
			a=n/2;
			if(n==0||n==1) {
				System.out.println(n+ "it is not a prime number");
			}else {
				for(int i=2;i<=a;i++) {
					if(n%2==0) {
						System.out.println(n+ "it is not a prime number");
						b=1;
						break;
					}
				}
				if(b==0) {
					System.out.println(n+ "it is a prime number");
				}
			}
			
		}
		}    
		  
