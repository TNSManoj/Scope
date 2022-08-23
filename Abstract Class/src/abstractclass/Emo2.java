package abstractclass;

public class Emo2 {

	public static void main(String[] args) {
		SBI S=new SBI();
		HDFC H=new HDFC();
		H.rateofinterest();
		System.out.println("the rate of interest in sbi"+S.rateofinterest());
		System.out.println("the rate of interest in hdfc"+H.rateofinterest());

	}

}
