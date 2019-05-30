package sort;

import java.util.Arrays;

public class check {

	public static void main(String[] args) {
		Comparable[] arr = {1,5,4,7,9};
		System.out.println(check(arr));

	}
	public static boolean check(Comparable[] arr) {
		Comparable[] arr1 =new Comparable[arr.length];
		for(int i=0;i<=arr.length-1;i++) {
			arr1[i]=arr[i];
		}
		Arrays.sort(arr);
		boolean flag=true;
		for(int i=0;i<arr1.length;i++) {
			if(arr[i]!=arr1[i]) {
				flag = false;
				break;
			}
		}
		return flag;
	}


}
