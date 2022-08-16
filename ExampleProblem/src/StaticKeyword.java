
public class StaticKeyword {
	int id;
	String name;
	static String college="NMIT";
	StaticKeyword(int i,String n){
		id=i;
		name=n;
	}
	 static void change() {
		college="narayana";
	}
	void show() {
		System.out.println(id+" "+name+" "+college);
	}

	public static void main(String[] args) {
		StaticKeyword s1=new StaticKeyword(101,"manoj");
		StaticKeyword s2=new StaticKeyword(102,"dinesh");
		change();
		s1.show();
		s2.show();

	}

}
