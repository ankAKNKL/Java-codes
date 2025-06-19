package xyz.com;

public class Linear {
	
public static void main(String[] args) {
	int arr[]= {12,65,12,34,65,23,45,78,65};
	int key=12;
	boolean flag=false;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==key) {
			System.out.println(" founf at "+i);
			flag=true;
			
		}
	}
if(flag==false) {
	System.out.println("not found");
}
 
	
}
}
