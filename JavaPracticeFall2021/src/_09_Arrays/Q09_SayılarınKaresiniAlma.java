package _09_Arrays;

import java.util.Arrays;

public class Q09_SayılarınKaresiniAlma {

	public static void main(String[] args) {
		/*
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */
		
		int arr []={2,6,4,5,8,9};
		int newArr [] =new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArr[i]+=arr[i]*arr[i];
		}System.out.println(Arrays.toString(newArr));

	}

}
