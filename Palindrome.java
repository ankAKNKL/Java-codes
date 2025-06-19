package Onelast.com;
import java.util.*;
public class Palindrome {
public static int palind(int num) {
	int rev=0;
	while(num!=0) {
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		
	}
	return rev;
}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int count=0;
	for(int i=1;;i++) {
		int num=i;
	int c=palind(num);
	if(c==num) {
		System.out.println(num);
		count++;
	}
	if(count==15) {
		break;
	}
	}
}
}
