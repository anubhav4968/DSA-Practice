// return the index by using binary search
package com.anubhav.day1;

public class Question_3 {

	public static void main(String[] args) {
		int[] arr = {-10,0,2,6,12,48,59,66};
		int target = 66;
		System.out.println(binarySearch(arr, target));
	}
	static int binarySearch(int[] arr , int target) {
		int start = 0;
		int end = arr.length-1;
		while(start <= end) {
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
				return mid;
			}
		}
		//ans does not found
		return -1;
	}
}
