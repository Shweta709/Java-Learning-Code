package dsAlgoArray;

import java.util.Arrays;

public class PairSum2Pointer {
	static void pairSum1(int arr[],int n ,int k) {
	int i=0;
	int j=n-1;
	Arrays.sort(arr);
	while(i<j) {
		if(arr[i] +arr[j] ==k) {
			System.out.println("pair is:" +arr[i] + " " +arr[j]);
		return;
		}
		else if((arr[i]+arr[j]) < k) {
			i++;
		}
		else if((arr[i]+arr[j]) > k)
		{
			j--;
		}
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,4,5,6,3,6,8};
		int k=11;
		int n=arr.length;
		pairSum1(arr,n,k);

	}

}
