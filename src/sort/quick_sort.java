package sort;
//快速排序  时间复杂度O(nlogn) 稳定排序?
import java.util.Arrays;

public class quick_sort {

	public static void main(String[] args) {
		Comparable[] arr= {14,2,4,3,57,13,11};
		quick(arr,0,6);
		System.out.println(Arrays.toString(arr));
	}
	public static void quick(Comparable[] arr,int lo,int hi) {
		if(lo>=hi) return;
		int index=partition(arr,lo,hi);
		quick(arr,lo,index-1);
		quick(arr,index+1,hi);
	}
	public static int partition(Comparable[] arr,int lo,int hi) {
		int i=lo,j=hi+1;
		Comparable v=arr[lo];//切分点
		while(true) {
			while(less(arr[++i],v)) {if(i==hi) break;}
			while(less(v,arr[--j])) {if(j==lo) break;}
			if(i>=j) break;
			exch(arr,i,j);
		}
		exch(arr,lo,j);
		return j;
	}
	public static  boolean less(Comparable v,Comparable w) {
		return v.compareTo(w)<0;
	}
	public static void exch(Comparable[] a, int j, int i) {
		Comparable t =a[j];
		a[j]=a[i];
		a[i]=t;		
	}

}
