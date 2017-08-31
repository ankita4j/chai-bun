//https://www.interviewcake.com/question/java/highest-product-of-3

package com.pandano1.learn;

public class HighestProduct3 {

	public static void main(String[] args) {
		int[] arr={10, 7, 5, 8, 11, 9};
		get__highest_products_of_three_ints(arr);
	}

	private static void get__highest_products_of_three_ints(int[] arr) {
		int one=arr[0];
		int two=arr[1];
		int three=arr[2];
		for(int i=3;i<arr.length;i++)
		{
			if(arr[i]>one || arr[i]>two || arr[i]>three){
				if(one<two && one<three)
					one=arr[i];
				else
					if(two<one && two<three)
						two=arr[i];
					else
						if(three<one && three<two)
							three=arr[i];
			}
		}
		System.out.println("product of highest 3 no is "+(one*two*three));
	}

}
