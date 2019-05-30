package sort;
//归并方法
import java.util.Arrays;
class Merge{
	public static void merge(Comparable[] arr,int lo,int mid,int hi) {
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
	}
	private static boolean less(Comparable v,Comparable w) {
		return v.compareTo(w)<0;
	}
}
public class merge0 {



	public static void main(String[] args) {
		Comparable[] a= {1,4,7,3,5,9};
		Merge.merge(a,0,2,5);
		System.out.println(Arrays.toString(a));
		Comparable[] a1= {4,3};
		Merge.merge(a1,0,0,1);
		System.out.println(Arrays.toString(a1));

	}

	
	

}
