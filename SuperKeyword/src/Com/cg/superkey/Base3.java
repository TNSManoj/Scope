package Com.cg.superkey;

public class Base3 extends Base2 {
	       Base3()
	{
		System.out.println("Default Constructor in Base3");
		}
		Base3(int i)
		{
		super(i);
		System.out.println("Constructor with int arg in BASE 3, i is "+i);
		}
		Base3(int i,int j)
		{
		System.out.println("Constructor with 2 int args in Base 3, i is "+i + "and j is "+j);
		}

}
