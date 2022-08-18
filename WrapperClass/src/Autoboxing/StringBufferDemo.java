package Autoboxing;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sc=new StringBuffer("hello manoj"); 
		System.out.println("Buffer=" + sc);
		System.out.println("Length=" + sc.length());
		System.out.println("Capacity=" +sc.capacity());
		//appending and inserting into stringbuffer.
		String s;
		int i=42;
		sc=new StringBuffer(40);
		s=sc.append("i=").append(i).append("!").toString();
		System.out.println(s);
		sc =new StringBuffer("I  Java");
		sc.insert(2, "like");
		System.out.println(sc);

	}

}
