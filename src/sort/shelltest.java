package sort;

import java.util.Arrays;

//希尔排序
/*	序列： a[n]=3*a[n-1]+1  
 * 
 */
class Shell{
	
	public static void shell_sort(Comparable[] arr,int[] increment) {
		for(int inc: increment) {
			for(int k=0;k<inc;k++) {
				for(int i=k+inc;i<arr.length;i+=inc) {
					for(int j=i;j>k&&less(arr[j],arr[j-inc]);j-=inc) {
						exch(arr,j,j-inc);
					}
				}
				//System.out.println(Arrays.toString(arr));
			}
		}
	}
	public static boolean less(Comparable v,Comparable w) {
		return v.compareTo(w)<0;
	}
	private static void exch(Comparable[] a, int j, int i) {
		Comparable t =a[j];
		a[j]=a[i];
		a[i]=t;		
	}
}
public class shelltest {

	public static void main(String[] args) {
		Comparable[] arr = {3,9,7,8,6,4,5,2};
		int[] increment= {3,2,1};
		Shell.shell_sort(arr, increment);
		Arrays.toString(arr);
		System.out.println(Arrays.toString(arr));
	}

}
