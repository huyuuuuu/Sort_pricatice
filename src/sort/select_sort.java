package sort;

import java.util.Arrays;

public class select_sort {

	public static void main(String[] args) {
		Comparable[] example = {44,7,92,47,36,74};
		select_sort(example);
		System.out.println(Arrays.toString(example));

	}
	
	public static void select_sort(Comparable[] arr) {
		int N=arr.length;
		for(int i=0;i<N;i++) {
			int min=i;
			for(int j=i+1;j<N;j++) {
				if(less(arr[j],arr[min])){
					min=j;
				}
			}
			exch(arr,i,min);
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
