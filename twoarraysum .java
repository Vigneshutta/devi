import java.io.*;
class twoarraysum {
	public static void main(String args[ ]) {
		int arr1[ ] = {1,2,3,4,5,6,7,8,9,10};
		int arr2[ ] = {1,2,3,4,5,6,7,8,9,10};
		int ans[ ] = new int[10];
		for(int i = 0; i < 10; i++)
			ans[i] = arr1[i] + arr2[i];
		System.out.println("Sum of two Array:");
		for(int i = 0; i < 10; i++)
			System.out.println(ans[i]);
	}
}
