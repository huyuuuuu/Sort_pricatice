package sort;
//冒泡排序
//稳定排序
import java.util.Arrays;

public class bubble_sort {

	public static void main(String[] args) {
		Comparable[] example = {44,7,92,47,36,74};
		bubble_sort(example);
		System.out.println(Arrays.toString(example));

	}
	public static void bubble_sort(Comparable[] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(less(arr[j+1],arr[j])) {
					exch(arr,j,j+1);}
			}
		}
	}
public static void bubble_sort1(Comparable[] arr) {
		
		int n=arr.length;
		boolean flag=true;
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(less(arr[j+1],arr[j])) {
					exch(arr,j,j+1);
					flag=false;
					}
			}
			if(flag) {
				break;
			}
		}
	}
	
	private static void exch(Comparable[] a, int j, int i) {
		Comparable t =a[j];
		a[j]=a[i];
		a[i]=t;		
	}
	private static boolean less(Comparable v,Comparable w) {
		return v.compareTo(w)<0;
	}

}
