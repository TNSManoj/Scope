
public class BreakWhileLoop {

	public static void main(String[] args) {
		int a=1;
		while(a<=10) {
			if(a==5)
			break;
			System.out.print(" Statement : " + a);
			a++;
		}
        System.out.println("End of program");
	}

}
