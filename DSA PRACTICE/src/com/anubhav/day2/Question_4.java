package com.anubhav.day2;
//https://leetcode.com/problems/find-in-mountain-array/
public class Question_4 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,4,3,2,1};
		int target = 3;
		System.out.println(findInMountainArray(target, arr));
	}
    public static int findInMountainArray(int target, int[] mountainArr) {
//    	System.out.println("Here");
        int peak = searchThePeakElement(mountainArr);
//        System.out.println(peak);
        int firstTry = orderAgnosticBinarySearch(mountainArr, target,0, peak);
        if(firstTry!=-1) {
        	return firstTry;
        }else
        {
        	return orderAgnosticBinarySearch(mountainArr, target, peak+1, mountainArr.length-1);
        }
    }

	static int searchThePeakElement(int[] arr) {
		int start =0;
		int end = arr.length-1;
		while(start < end) {
			int mid = start +  (end -start)/2;
			
			if(arr[mid] > arr[mid+1]) {
				end = mid;
			}else {
				start = mid +1;
			}
			
			
		}
		return end;
	}
	static int orderAgnosticBinarySearch(int[] arr , int target, int start , int end) {
		boolean isaAsc  = arr[start] <= arr[end]; 
		while(start <= end) {
			int mid = start + (end-start)/2;
			
			if(target==arr[mid]) {
				return mid;
			}
			if(isaAsc) {
				if(target < arr[mid]) {
					end = mid -1;
				}else {
					start = mid+1;
				}
			}else
			{
				if(target > arr[mid]) {
					end = mid-1;
				}
				else {
					start = mid +1;
				}
			}
		}
		return -1;
	}
}
