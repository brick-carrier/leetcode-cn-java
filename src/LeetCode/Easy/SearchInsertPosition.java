package LeetCode.Easy;

import java.util.Arrays;

/**
 * 35、Search Insert Position
 Description
 Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

 You may assume no duplicates in the array.

 Example 1:

 Input: [1,3,5,6], 5
 Output: 2

 Example 2:

 Input: [1,3,5,6], 2
 Output: 1

 Example 3:

 Input: [1,3,5,6], 7
 Output: 4

 Example 4:

 Input: [1,3,5,6], 0
 Output: 0
 Tags: Array, Binary Search
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int nums[]={1,2,4,5,6};
        System.out.println(searchInsert(nums,1));
    }

    public static int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while (low<=high){
            mid=(low+high)/2;
            if(target>nums[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }

}
