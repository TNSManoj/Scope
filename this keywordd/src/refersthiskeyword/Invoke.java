package refersthiskeyword;

public class Invoke {
	Invoke(){
		System.out.println("hello a");
	}
	Invoke(int x){
		this();
		System.out.println(x);
	}

	public static void main(String[] args) {
		Invoke a=new Invoke(10);

	}

}
