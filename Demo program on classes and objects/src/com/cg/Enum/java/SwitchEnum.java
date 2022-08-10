package com.cg.Enum.java;

public class SwitchEnum {
	enum Choice{Choice1, Choice2, Choice3 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Choice ch = Choice.Choice1;
      switch(ch) {
      case Choice1:
    	  System.out.println("choice1 selected");
    	  break;
      case Choice2:
    	  System.out.println("choice2 selected");
    	  break;
      case Choice3:
    	  System.out.println("choice3 selected");
    	  break;
      }
	}

}
