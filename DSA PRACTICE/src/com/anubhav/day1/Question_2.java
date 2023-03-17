package com.anubhav.day1;

public class Question_2 {

	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{3,2,1}
				
		};
		System.out.println(maximumWealth(arr));
	}
    public static int maximumWealth(int[][] accounts) {
        int[] arr = new int[accounts.length];
        
        for(int row=0;row<accounts.length;row++) {
        	int total = sum(accounts[row]);
        	arr[row]=total;
        }
        return max(arr);
    }
    
    static int max  (int[] arr) {
    	int greater = Integer.MIN_VALUE;
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]>greater) {
    			greater=arr[i];
    		}
    	}
    	return greater;
    }
    
    static int sum(int[] arr) {
    	int sum =0;
    	for(int i=0;i<arr.length;i++) {
    		sum=sum+arr[i];
    	}
    	return sum;
    }
}
