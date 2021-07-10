package dsAlgoArray;

public class MaxDiffP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,4,11,5,8,1,9};
		int max = Integer.MIN_VALUE;
		int first = 0;
		int last = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(max < arr[j] - arr[i]) {
					max = arr[j] - arr[i];
					first = arr[i];
					last = arr[j];
				}
			}
		}
		System.out.println(first + " : " + last + " : " + max);
	}
}

		/* APPROACH 2
 * int arr[] = {2,4,11,5,8,1,9};
		int res = arr[1] - arr[0];
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				res = Math.max(res,  arr[j] - arr[i]);
			}
		}
//		System.out.println(first + " : " + last + " : " + max);
		System.out.println(res);
 */
		
		/* APPROACH 3
		 * int arr[] = {2,4,11,5,8,1,9};
		int res = arr[1] - arr[0];
		int minVal = arr[0];
		for(int i = 1; i < arr.length; i++) {
			res = Math.max(res,  arr[i] - minVal);
			minVal = Math.min(minVal, arr[i]);
		}
//		System.out.println(first + " : " + last + " : " + max);
		System.out.println(res);
		
		 */
	


