package oop.com;
//POLYMORPHISIM RUNTIME-----METHOD OVERRIDDING
class Plane 
{
	void fly()
	{
		System.out.println("plane is flying");
		
	}
	void land() {
		System.out.println("plane landed");
	}
}
class Passenger extends Plane
{
	void fly(){
		System.out.println(" passenger plane is flying ");
	}
}
class Cargo extends Plane
{
	void fly()
	{
		System.out.println(" Cargo is flying");
	}
}


class Hithesh
{
	void d(Plane ref) {
		ref.fly();
		ref.land();
	}
}

public class Inherit {

	public static void main(String[] args) {
	Passenger p=new Passenger();
	Cargo c=new Cargo();
	Hithesh h=new Hithesh();
	h.d(p);
	h.d(c);
			}
}
