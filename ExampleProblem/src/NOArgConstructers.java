
public class NOArgConstructers {
	int id;
	String name;
    float salary;
    NOArgConstructers(){
    	System.out.println("user defined no-argument "+"constructer exected");
    }
    void show() {
    	System.out.println(id +" "+ name +" "+ salary);
    }
	public static void main(String[] args) {
		NOArgConstructers s1=new NOArgConstructers();
		NOArgConstructers s2=new NOArgConstructers();
		s1.show();
		s2.show();
		

	}

}
