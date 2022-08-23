package refersthiskeyword;

public class Hello {
	Hello(){
		this(5);
		System.out.println("hello a");
	}
	Hello(int x){
		System.out.println(x);
	}

	public static void main(String[] args) {
		Hello a=new Hello();

	}

}
