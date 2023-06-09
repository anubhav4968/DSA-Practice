//Sealing of a number (FInd the smallest number in array greater than or equal to the target element)
package com.anubhav.day1;
public class Question_5 {

	public static void main(String[] args) {
		int[] arr = {-10,0,2,6,12,48,59,66};
		int target = 743;
		int ans = sealingOfNumber2(arr, target);
		if(ans!=-1) {
			System.out.println(arr[ans]);
		}
		else
		{
			System.out.println("Array Does not have element greater than or equal to Target element!!!");
		}
		
	}
	//Meathod 1
	static int sealingOfNumber(int[] arr , int target) {
		int start = 0;
		int doesNotFound = 0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = start + (end - start)/2;
//			System.out.println("Start: "+start+" End: "+end+" Mid: "+ mid+" Element in the middle: "+arr[mid]+" Target: "+target);
			if(target < arr[mid]) {
				end = mid -1 ;
			}
			else if(target > arr[mid]) {
				start = mid + 1;
			}
			else if(target==arr[mid] && mid==arr.length-1)
			{
				return -1;
			}
			else if(target==arr[mid])
			{
				return arr[mid+1];
			}
			
			if(mid==arr.length-1) {	
				doesNotFound = -1;
			}
			else {
				doesNotFound = arr[mid+1];
				System.out.println(doesNotFound);
			}
		}
		return doesNotFound;
	}
	//Method 2
	static int sealingOfNumber2(int[] arr , int target) {
		int start = 0;
		int end = arr.length-1;
		while(start <= end) {
			if(target > arr[end]) {
				return -1;
			}
			//Get the middle element
			int mid = start + (end - start)/2;
//			System.out.println("Start: "+start+" End: "+end+" Mid: "+ mid+" Element in the middle: "+arr[mid]+" Target: "+target);
			if(target < arr[mid]) {
				end = mid -1 ;
			}
			else if(target > arr[mid]) {
				start = mid + 1;
			}
			else
			{
				//ans found
				return mid+1;
			}
		}
		//ans does not found
		return start;
	}
}
