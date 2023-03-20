package com.anubhav.day3;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class Question_1 {

	public static void main(String[] args) {
		int[] arr= {4,5,6,7,0,1,2};
		int target =3;
		System.out.println(findPivot(arr));
		System.out.println(search(arr, target));
	}
	
	public static int search(int[] nums, int target) {
		int pivot = findPivot(nums);
		
		if(pivot==-1) {
			return binarySearch(nums, target, 0, nums.length-1);
		}
		
		if(nums[pivot] == target) {
			return pivot;
		}
		if(target >= nums[0])  //[1,2,3,4,5,4,3,2,1] //pivot =5 3>4
		{	
		
		    return binarySearch(nums, target, 0, pivot-1);
		}
		
			return binarySearch(nums, target, pivot+1,nums.length-1);
		
			
    }
	
	static int binarySearch(int[] arr,int target , int start , int end) {
		while(start <= end) {
			
			int mid = start + (end-start)/2;
			System.out.println("Start: "+start+" End: "+end+" Mid: "+ mid+" Element in the middle: "+arr[mid]+" Target: "+target);
			if(arr[mid] > target) {
				end = mid-1;
			}
			else if(arr[mid]<target) {
				start = mid+1;
			}else
			{
				return mid;
			}
		}
		return -1;
	}
	
	static int findPivot(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		while(start <= end) {
			//mid 
			int mid = start + (end-start)/2;
			
			//all 4 cases;
			//case1
			if(mid<end && arr[mid]>arr[mid+1]) {
				return mid;
			}
			//case2
			if (mid>start && arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			//case 3 [1,2,3,4,5,4,3,2,1]
			if(arr[mid]>=arr[start]) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return -1;
	}
}
