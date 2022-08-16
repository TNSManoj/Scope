
public class Method {
	int id;
	String name;
	void insertRecord(int id,String name) {
		this.id=id;
		this.name=name;
	}
	void displyInformation() {
		System.out.println(this.id +" "+this.name);
	}
	

	public static void main(String[] args) {
	    Method s1=new Method();
	    Method s2=new Method();
	    s1.insertRecord(101,"manoj");
	    s2.insertRecord(102,"dinesh");
	    s1.displyInformation();
	    s2.displyInformation();

	}

}
