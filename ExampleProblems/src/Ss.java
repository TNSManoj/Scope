
public class Ss {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				
					
				
				System.out.print(i==1 || i==n?" $ ":(!(j==1||j==4))? "  " : " $ ");
			}
			System.out.println();
		}

	}

}
