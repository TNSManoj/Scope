package Com.cg.superkey;

public class Derived2 extends Base3 {
	public Derived2() {
		System.out.println("Default Constructor in DERIVED CLASS");
		}
		public Derived2(int i, int j) {
		super(i);
		System.out.println("Constructor with 2 int args in DERIVED, i is "+i + "and j is "+j);
		}
		public Derived2(int i) {
			System.out.println("Constructor with int arg in DERIVED, i is "+i);
		}

}
