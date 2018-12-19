package LeetCode.Easy;

/**
 *26、Remove Duplicates from Sorted Array
 Description
 Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

 Example 1:

 Given nums = [1,1,2],

 Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

 It doesn't matter what you leave beyond the returned length.
 Example 2:

 Given nums = [0,0,1,1,1,2,2,3,3,4],

 Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

 It doesn't matter what values are set beyond the returned length.
 Clarification:

 Confused why the returned value is an integer but your answer is an array?

 Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.

 Internally you can think of this:

 // nums is passed in by reference. (i.e., without making a copy)
 int len = removeDuplicates(nums);

 // any modification to nums in your function would be known by the caller.
 // using the length returned by your function, it prints the first len elements.
 for (int i = 0; i < len; i++) {
 print(nums[i]);
 }
 Tags: Array, Two Pointers
 */
public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode t1=new ListNode(2);
        ListNode t2=new ListNode(2);
        ListNode t3=new ListNode(3);
        ListNode t4=new ListNode(4);
        ListNode t5=new ListNode(4);
        head.next=t1;
        t1.next=t2;
        t2.next=t3;
        t3.next=t4;
        t4.next=t5;
        ListNode t8=deleteDuplicates(head);
    }

    public static ListNode deleteDuplicates(ListNode head){

        if (head.next==null){
            return head;
        }
        deleteDuplicates(head.next);
        if (head.next.val==head.val){
            if (head.next.next!=null) {
                head.next = head.next.next;
            }else{
                head.next=null;
                return head;
            }
        }
        return head;
    }
}
