package com.anubhav.day1;
//https://leetcode.com/problems/richest-customer-wealth/
public class Question_2 {

	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{3,2,1}
				
		};
		System.out.println(maximumWealth(arr));
	}
    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        
        for(int row=0;row<accounts.length;row++) {
        	int total = sum(accounts[row]);
        	if(max<total) {
        		max = total;
        	}
        }
        return max;
    }
    
//    static int max  (int[] arr) {
//    	int greater = Integer.MIN_VALUE;
//    	for(int i=0;i<arr.length;i++) {
//    		if(arr[i]>greater) {
//    			greater=arr[i];
//    		}
//    	}
//    	return greater;
//    }
    
    static int sum(int[] arr) {
    	int sum =0;
    	for(int i=0;i<arr.length;i++) {
    		sum=sum+arr[i];
    	}
    	return sum;
    }
}
