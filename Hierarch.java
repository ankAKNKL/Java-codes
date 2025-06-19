package oop.com;
//Hierarchical INheritence 
class A{
	void a()
	{
		System.out.println(" A is");
	}
}
class B extends A{
	void b(){
		System.out.println("b is");
	}
}
class C extends A{
	void c()
	{
		System.out.println(" c is");
	}
}
public class Hierarch {
	
	public static void main(String[] args) {
		 B a1=new B();
		 a1.a(); 
		a1.b();
		C c1=new C();
		c1.c();
		
		
		
		
	}

}
