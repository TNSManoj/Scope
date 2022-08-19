package Com.cg.superkey;

public class Executer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating object of Base 2 \n Base2 obj1=new Base2(); \n" +

		"This will not work because it is ABSTRACT!");

		//Base1 obj1=new Base1();
		System.out.println("--------------------------------------------------------------");

		System.out.println("Creating object of Base3 as: \n" +

		"Base3 obj2=new Base3()");

		Base3 obj2=new Base3();
		System.out.println("--------------------------------------------------------------");

		System.out.println("Creating object of Base2 as: \n" +

		"Base1 obj3=new Base2()");

		Base3 obj3=new Base3();
		 
		System.out.println("--------------------------------------------------------------");
		System.out.println("Creating object of Base2 as: \n" +

		"Base1 obj4=new Base2(4)");

		Base3 obj4=new Base3(4);
		System.out.println("--------------------------------------------------------------");
		System.out.println("Creating object of Base2 as: \n" +

		"Base1 obj5=new Base2(4,2)");
		Base3 obj5=new Base3(4,2);
		System.out.println("--------------------------------------------------------------");
		System.out.println("Creating object of Base2 as: \n" +
		"Base2 obj6=new Base2(5,6)");
		Base3 obj6=new Base3(5,6);
		System.out.println("--------------------------------------------------------------");
		System.out.println("Creating object of Derived as:\n " +
		"Base1 obj7=new Derived(5,6)");
		Base2 obj7=new Derived2(5,6);
		System.out.println("--------------------------------------------------------------");
		System.out.println("Creating object of Derived as:\n " +
		"Derived obj8=new Derived(5,6)");
		Derived2 obj8=new Derived2(5,6);
		System.out.println("--------------------------------------------------------------");

	}

}
