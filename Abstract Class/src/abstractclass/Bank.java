package abstractclass;

public abstract class Bank {
	abstract int rateofinterest();

}
      class SBI extends Bank{
    	  int rateofinterest() {
    		  return 7;
    	  }
    	  
      }
      class HDFC extends Bank{
    	  int rateofinterest() {
    		  return 8;
    	  }
      }