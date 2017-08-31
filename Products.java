//https://www.interviewcake.com/question/java/product-of-other-numbers

package sorting;

public class Products {

	public static void main(String[] args) {

		int[] noArr=  {1, 7, 3, 4};
		get_products_of_all_ints_except_at_index(noArr);
	}

	private static void get_products_of_all_ints_except_at_index(int[] noArr) {
		System.out.print("[");
		for(int i=0;i<noArr.length;i++)
		{
			System.out.print(product(noArr,i)+",");
		}
		System.out.print("]");
	}

	private static int product(int[] noArr, int index) {
		int product=1;
		for(int i=0;i<noArr.length;i++)
		{
			if(i!=index)
			{
				product=product*noArr[i];
			}
		}
		return product;
	}

}
