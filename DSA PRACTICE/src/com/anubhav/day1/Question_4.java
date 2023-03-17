//Order agnostic binary search
package com.anubhav.day1;
public class Question_4 {

	public static void main(String[] args) {
		int[] arr = {-10,0,2,6,12,48,59,66};
		int target = 66;
		System.out.println(orderAgnosticBinarySearch(arr, target));
		
		
	}
	
	static int orderAgnosticBinarySearch(int[] arr , int target) {
		int start = 0 ;
		int end = arr.length-1;
		boolean isAsc = (arr[start] <= arr[end]);
		System.out.println(isAsc);
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			System.out.println("Start: "+start+" End: "+end+" Mid: "+ mid+" Element in the middle: "+arr[mid]+" Target: "+target);
			if(target == arr[mid]) {
				return mid;
			}
			
			if(isAsc) {
				if(target < arr[mid]) {
					end = mid -1 ;
				}
				else if(target > arr[mid]) {
					start = mid + 1;
				}
			}
			else
			{
				if(target > arr[mid]) {
					end = mid -1 ;
				}
				else if(target < arr[mid]) {
					start = mid + 1;
				}
			}
		
			
		}
		
		return -1;
		
	}
}
