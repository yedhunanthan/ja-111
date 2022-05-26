package three;

import java.util.Arrays;

public class Main {
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		int[] ans = new int[10];
		int c =0;
			for(int i=0;i<inputArray.length;i++) {
				for(int j=2;j<inputArray[i]/2;j++) {
					if(inputArray[i]%j == 0) {
						break;
					}
					else {
						if(inputArray[i] != 0) {
							ans[c]=inputArray[i];
							c++;
						}
						break;
					}
				}
			}
			return ans;
		}
		public static void main(String[] args){
			int[] arr = {10,12,5,50,11,14,15};
			Main m1 = new Main();
			int[] x = m1.findAndReturnPrimeNumbers(arr);
			if(arr.length == 0) {
				System.out.println("Prime number not found in the supplied Array");
			}
			else {
				System.out.println(Arrays.toString(x));
			}
			// 
		}
}
