package LeetCode.Easy;

import java.util.Arrays;

/**
 * 88、Merge Sorted Array
 Description
 Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

 Note:

 The number of elements initialized in nums1 and nums2 are m and n respectively.
 You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 Example:

 Input:
 nums1 = [1,2,3,0,0,0], m = 3
 nums2 = [2,5,6],       n = 3

 Output: [1,2,2,3,5,6]
 Tags: Array, Two Pointers
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] num1={1,2,4,6,8,0,0};
        int[] num2={5,7};
        merge(num1,5,num2,2);
        for (int num:num1){
            System.out.println(num);
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        while(n>0) {
            nums1[m+n-1]=(m==0||nums2[n-1]>nums1[m-1])?nums2[--n]:nums1[--m];
        }
    }

 }