//https://www.interviewcake.com/question/java/product-of-other-numbers

// Note: you can multiply all of them in O(n) and then just divide by the each element in another pass
// Also check BigInteger class because the priduct might not be in int or long range.

package com.pandano1.learn;

public class Products {
	static int[] noArr=  {1, 7, 3, 4};
	static int len=noArr.length;
	static int[] start=new int[len];
	static int[] end=new int[len];
	public static void main(String[] args) {

		int[] noArr=  {1, 7, 3, 4};
		get_products_of_all_ints_except_at_index(noArr);
	}

	private static void get_products_of_all_ints_except_at_index(int[] noArr) {
		int j=len-1;
		start[0]=end[j--]=1;
		for(int i=1;i<len && j>=0;i++,j--)
		{
			start[i]=start[i-1]*noArr[i-1];
			end[j]=end[j+1]*noArr[j+1];
		}
		System.out.print("[");
		for(int i=0;i<noArr.length;i++)
		{
			System.out.print(start[i]*end[i]+",");
		}
		System.out.print("]");
	}
	
}
