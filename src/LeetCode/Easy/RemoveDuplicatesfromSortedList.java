package LeetCode.Easy;

/**
 *83、Remove Duplicates from Sorted List
 Given a sorted linked list, delete all duplicates such that each element appear only once.

 Example 1:

 Input: 1->1->2
 Output: 1->2
 Example 2:

 Input: 1->1->2->3->3
 Output: 1->2->3
 */
public class RemoveDuplicatesfromSortedList {

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
