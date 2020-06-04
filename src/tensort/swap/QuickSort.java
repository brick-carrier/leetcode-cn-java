package tensort.swap;

import java.util.Arrays;

/**
 * �������� ƽ��ʱ�临�Ӷ�O(NLogN)  �O(N^2)  ���O(NLogN)   ���ȶ�
 * @author Administrator
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={400,28,77,6,8,9};
		quicksort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void quicksort(int[] arr,int start,int end){	
		// �ݹ����������startIndex�����endIndex��ʱ��
		if (start >= end) {
			return;
		}
		int pivotIndex=patition(arr, start,end);
		
		quicksort(arr, start, pivotIndex-1);
		quicksort(arr, pivotIndex+1,end);
	}
	
	public static int patition(int[] arr,int start,int end){
		int pivot=arr[start];
		int left=start;
		int right=end;
		while(left!=right){
			
			
			while(left<right&&arr[right]>pivot){
				right--;
			}		
			
			while(left<right&&arr[left]<=pivot){
				left++;
			}
			
			if (left<right) {		
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
			}			
		}
		
		int temp=arr[left];
		arr[left]=arr[start];
		arr[start]=temp;
		return left;
	}

}
