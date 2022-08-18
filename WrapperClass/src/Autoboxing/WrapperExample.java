package Autoboxing;

public class WrapperExample {

	public static void main(String[] args) {
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		double d=50;
		float f=60;
		char c='a';
		boolean b2=true;
    //autoboxing:converting primitive to objects
		Byte byteobj=b;
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Double doubleobj=d;
		Float floatobj=f;
		Character charobj=c;
		Boolean booleanobj=b2;
		System.out.println("---Printing object values--- ");
		System.out.println("Byte value : " +byteobj);
        System.out.println("Short value : "+shortobj);
        System.out.println("Integer value : "+intobj);
        System.out.println("Long value : "+longobj);
        System.out.println("Double value :"+doubleobj);
        System.out.println("Float value : "+floatobj);
        System.out.println("Character value : "+charobj);
        System.out.println("Boolean value : "+booleanobj);
		
		//UNBOXING:CONVERTING OBJECTS TO PRIMITIVES
		byte bytevalue=byteobj;
		short shortvalue=shortobj;
		int intvalue=intobj;
		long longvalue=longobj;
		double doublevalue=doubleobj;
		float floatvalue=floatobj;
		char charvalue=charobj;
		boolean booleanvalue=booleanobj;
		System.out.println("---printing object values--");
		System.out.println("Byte value :"+bytevalue);
		System.out.println("Short value :"+shortvalue);
		System.out.println("Int value :"+intvalue);
		System.out.println("Long value :"+longvalue);
		System.out.println("Double value :"+doublevalue);
		System.out.println("Float value :"+floatvalue);
		System.out.println("Char value :"+charvalue);
		System.out.println("Boolean value :"+booleanvalue);
	}

}
