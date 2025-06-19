package Onelast.com;

public class BubbleSort {
public static void main(String[] args) {
	int arr[]= {23,12,56,34,90,65,15,4};
	for(int j=0;j<arr.length;j++) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	int low=0,high=arr.length-1;
	int key=65;
	int mid=0;
	while(low<=high) {
		 mid=(low+high)/2;
		if(arr[mid]==key) {
			System.out.println();
			System.out.println(mid);
			break;
		}
		 if(key>arr[mid]) {
			low=mid+1;
		}
		 else if(key<arr[mid]) {
			high=mid-1;
		}
		
	}
	
			}
}
