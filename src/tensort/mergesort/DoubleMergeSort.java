package tensort.mergesort;

import java.util.Arrays;

/**
 * 归并排序 平均时间复杂度O(NlogN)  最坏O(NlogN)  最好O(NlogN)   稳定
 * @author Administrator
 *
 */
public class DoubleMergeSort {
	
	public static void main(String[] args) {
		int[] arr={1,5,6,3,4};
		int[] arr1=mergesort(arr);
		for (int i : arr1) {
			System.out.println(i);
		}
	}
	
	
	public static int[] mergesort(int[] arr){
		if (arr==null||arr.length<2) {
			return arr;
		}
		int mid=arr.length/2;
		int[] left=Arrays.copyOfRange(arr, 0, mid);
		int[] right=Arrays.copyOfRange(arr, mid, arr.length);
		return merge(mergesort(left),mergesort(right));
	}
	
	public static int[] merge(int[] left,int[] right){
		int arrLength=left.length+right.length;
		int[] result=new int[arrLength];
		for(int index=0,i=0,j=0;index<arrLength;index++){
			 if (i>=left.length) {
				result[index]=right[j++];
			}else if (j>=right.length) {
				result[index]=left[i++];
			}else if (left[i]>right[j]) {
				result[index]=right[j++];
			}else {
				result[index]=left[i++];
			}
		}
		return result;
	}
	
	

}
