package Onelast.com;

public class Armstrong {
	public static int count(int num) {
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		return count;
	}
	public static int arm(int num) {
		int sum=0;
		int c=count(num);
		while(num!=0) {
			int digit=num%10;
			sum=sum+(int)Math.pow(digit, c);
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int num=154 ;
		int ans=arm(num);
		if(num==ans) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not");
		}
	}

}
