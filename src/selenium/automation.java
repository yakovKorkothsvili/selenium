package selenium;


  class  A{
       A() {
		System.out.println("i am class a");
		this.func();
	}
          public void  func() {
        	System.out.println("i am func a");
        }
}

class B extends A{
	 B() {
		 System.out.println("i am class b");
		func();
	}
	 @Override
	 public void func() {
		 System.out.println("i am func b");
	 }
}

