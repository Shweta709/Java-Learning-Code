package dsAlgoArray;

import java.util.Arrays;

public class PairSumCount {
//	public static void Pairsumcount(int arr[],int n,int sum=10) {
//		
//		int count =0;
//		for(int i=0;i<n-1;i++) {
//			for(int j=i+1;j<n;j++) {
//				if((arr[i]+arr[j])==sum)
//					count++;
//			}
//		}
//		System.out.println(count);
//	}
//Approach 2:
	static void pairSum2(int arr[]) {
		int sum=10;
				int n=arr.length;
				Arrays.sort(arr);
		int i=0;
		int j=n-1;
		Arrays.sort(arr);
		int ans=0;
		while(i<j) {
			if(arr[i] +arr[j] ==sum) {
				
				if((arr[i]==arr[j])) {
					//ans = 0;
					//5 ,5,5 -sandwich Element
					int len=j-i+1;
					ans +=len*(len-1) / 2;  //combination formula
					System.out.println("Ans is: " +arr[i]+ " " +arr[j]);
					break;
				}
				int c1=0; //counter frequency of ith element
				int c2=0;
				int v1=arr[i];
				int v2=arr[j];
				while(arr[i]==v1) {
					i++;c1++;
				}
				ans=ans+(c1+c2); //product of both count to get the combination
				while(arr[i]==v1) {
					j--;c2++;
				}
				//System.out.println("pair is::" +v1+" "+v2);
				System.out.println("frequency is::" +c1+" "+v2);
				
			}
			else if((arr[i]+arr[j]) < sum) {
				i++;
			}
			else if((arr[i]+arr[j]) > sum)
			{
				j--;
			}
		}
		System.out.println("Ans is: ::" +ans);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,4,6,5,6,3,6};
		pairSum2(arr);
		
	}
	

}
