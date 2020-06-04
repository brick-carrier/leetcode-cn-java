package tensort.swap;

/**
 * 冒泡排序 平均时间复杂度O(N^2)  最坏O(N^2)  最好O(N)    稳定
 * @author Administrator
 *
 */
public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,8,9};
		bubblesort(arr);
		for (int i : arr) {
			System.out.printf("%d\t",i);
		}
	}
	
	public static void bubblesort(int arr[]){
		if (arr==null||arr.length==1) {
			throw new RuntimeException("不符合排序标准");
		}
		boolean flag=false;//判断本轮是否进行排序，false则说明该轮没进行排序，排序已完成，break
		int temp=0;//用于交换
		s:for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				//大于，升序
				if (arr[j]>arr[j+1]) {
					flag=true;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if (!flag) {
				System.out.println("--------------"+flag+i);
				break s;
			}
			flag=false;
		}
	}

}
