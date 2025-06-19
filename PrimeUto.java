package Onelast.com;

public class PrimeUto {
	
	public static int isprime(int num){
		int count=0;

			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}
			return count;
		}
	public static void main(String[] args) {
		int num=0;
	int	sum=0,count=0;
		for(int i=1;;i++) {
		num=i;
		int c=isprime(num);
		if(c==2) {
			System.out.println(num);
			sum=sum+num;
			count++;
		}
		if(count==10) {
			break;
		}
		}
			
	System.out.println(sum);
	}
}
