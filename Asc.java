package xyz.com;

import java.util.Arrays;

public class Asc {
	public static void main(String[] args) {
		int arr[]= {12,34,0,12,0,34,56,7};
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j] ) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
				
				//virat kohli 
				
			}
			
		
		}
		int res[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0) {
				res[index]=arr[i];
				index++;
			}
		}
		
		System.out.println(Arrays.toString(res));
	}

}
