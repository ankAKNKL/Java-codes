package oop.com;
//ENCAPSULATION
class student
{
	private int per;
	public void setper(int n)
	{
		if(n>=55&&n<=100)
		{
			per=n;
		}
		else {
			System.out.println("invalid");
		}
	}
	public int getper()
	{
		return per;
	}
}
 
public class Encap {
	public static void main(String[] args) {
		student a=new student();
		a.setper(34);
		a.getper();
	}


}
