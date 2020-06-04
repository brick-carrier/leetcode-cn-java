package swordoffer.linkedlist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

import org.w3c.dom.ls.LSInput;

/**
 * [剑指offer003]打印反转链表
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList
 * @author Administrator
 *
 */
public class PrintListFromTailToHead_003 {
	public static void main(String[] args) {

		ListNode node=new ListNode(0);
		ListNode node1=new ListNode(1);
		node.next=node1;
		ListNode node2=new ListNode(2);
		node1.next=node2;
		ListNode node3=new ListNode(3);
		node2.next=node3;
		ListNode node4=new ListNode(4);
		node3.next=node4;

		ArrayList< Integer> list=printListFromTailToHead2(node);
		for (Integer integer : list) {
			System.out.printf("%d\t",integer);
		}

	}
	//非递归
	//用栈实现
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		if (listNode==null) {
			return null;
		}

		Stack<Integer> valStack=new Stack<>();
		while(listNode!=null){
			valStack.push(listNode.val);
			listNode=listNode.next;
		}
		ArrayList<Integer> vaList=new ArrayList<>();
		while(!valStack.isEmpty()){
			vaList.add(valStack.pop());
		}
		return vaList;
	}

	//非递归
	public static ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
		ArrayList<Integer> list=new ArrayList<>();
		while (listNode!=null) {
			//最新的数用远在0位
			list.add(0,listNode.val);
			listNode=listNode.next;
		}
		return list;
	}
	//递归
	public static ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
		ArrayList<Integer> list=new ArrayList<>();
		digui(list,listNode);
		return list;
	}

	public static void digui(ArrayList<Integer> list,ListNode listNode){
		if (listNode!=null) {
			digui(list, listNode.next);
			list.add(listNode.val);
		}
	}




	//

}


class ListNode{
	int val;
     ListNode next = null;
     
      ListNode(int val) {
          this.val = val;
       }
}
