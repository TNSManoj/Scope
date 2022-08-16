
public class ParametersConstructer {
	int id;
	String name;
	float salary;
	public ParametersConstructer(int id,String name,float salary){
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void show() {
		System.out.println(id +" "+ name +" "+ salary);
	}

	public static void main(String[] args) {
		ParametersConstructer s1=new ParametersConstructer(101,"manoj",1000);
		ParametersConstructer s2=new ParametersConstructer(102,"dinesh",2000);
		ParametersConstructer s3=new ParametersConstructer(103,"charan",3000);
		s1.show();
		s2.show();
		s3.show();

	}

}
