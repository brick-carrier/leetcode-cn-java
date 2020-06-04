package tensort.select;

/**
 * 快速排序 平均时间复杂度O(N^2)  最坏O(N^2)  最好O(N^2)   不稳定
 * @author Administrator
 *
 */
public class SelectSort {
		public static void main(String[] args) {
			int[] arr={1,28,77,6,8,9};
			selectsort(arr);
			for (int i : arr) {
				System.out.printf("%d\t",i);
			}
		}
		
		//�ӵ�һλ��ʼ
		public static void selectsort(int[] arr){
			int temp=0;
			for(int i=0;i<arr.length-1;i++){
				for(int j=i+1;j<arr.length;j++){
					if (arr[j]<arr[i]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
}
