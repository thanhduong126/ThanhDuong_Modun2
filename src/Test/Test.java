package Test;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int index = 1;
		int[] newArr= Arrays.copyOf(arr, arr.length-1);
		for (int i = 0; i <arr.length-1; i++) {
			newArr[i] = arr[i];
			if (i==index){
			newArr[i]=arr[i+1];
			}
		}
		for (int x:newArr){
			System.out.println(x);
		}
	}

}
