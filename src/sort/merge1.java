package sort;

import java.util.Arrays;

public class merge1 {
	/*public static void merge(Comparable[] arr,int lo,int mid,int hi) {
		int i=lo;
		int j=mid+1;
		Comparable[] aux = new Comparable[hi-lo+1];
		for(int k=lo;k<=hi;k++) {
			aux[k]=arr[k];
		}
		for(int k=lo;k<=hi;k++) {
			if(i>mid) arr[k]=aux[j++];
			else if(j>hi) arr[k]=aux[i++];
			else if(less(aux[j],aux[i])) arr[k]=aux[j++];
			else arr[k]=aux[i++];
		}
	}*/
	
	private static void part_sort(Comparable[] a,int lo,int hi) {
		if(hi<=lo) return;
		int mid = lo+(hi-lo)/2;
		part_sort(a,lo,mid);
		part_sort(a,mid+1,hi);
		Merge.merge(a,lo,mid,hi);
	}
	public static void main(String[] args) {
		Comparable[] a= {1,3,5,7,2,4,6,8,10,12};
		part_sort(a,0,9);
		System.out.print(Arrays.toString(a));

	}
}
