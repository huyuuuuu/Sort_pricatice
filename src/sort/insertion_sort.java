package sort;
// 插入排序
//稳定排序
import java.util.Arrays;

public class insertion_sort {

	public static void main(String[] args) {
		Comparable[] example = {31,23,7,92,47,36,74};
		insertion_sort(example);
		System.out.println(Arrays.toString(example));
	}
	
	public static void insertion_sort(Comparable[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j>0 && less(arr[j],arr[j-1]);j--) {
				exch(arr,j,j-1);
				System.out.println(Arrays.toString(arr));
			}
		}
	}
	
	public static void exch(Comparable[] a, int j, int i) {
		Comparable t =a[j];
		a[j]=a[i];
		a[i]=t;		
	}
	public static boolean less(Comparable v,Comparable w) {
		return v.compareTo(w)<0;
	}

}
