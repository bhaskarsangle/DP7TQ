package com.statickeyword;

public class StaticVariableDemo {
      int x=10;
      static int y=20;
      void instanceMethod() {
    	  System.out.println(x);
    	  System.out.println(y);

      }
      static void staticMethod() {
    	//  System.out.println(x);//compile error
    	  System.out.println(y);


      }
	public static void main(String[] args) {
               StaticVariableDemo sv=new StaticVariableDemo();
               sv.instanceMethod();
              staticMethod();
	}

}
