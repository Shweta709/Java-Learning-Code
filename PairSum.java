package dsAlgoArray;

public class PairSum {
//	static void pairSum1(int arr[],int n ,int k) {
//		int sum=0;
//		for(int i=0;i<n;i++) {
//			for(int j=i+1;j<n;j++)
//			{
//				sum=arr[i]+arr[j];
//				if(sum==k)
//				{
//					System.out.println("Pair is" +arr[i]+" "+arr[j]);
//					return;
//				}
//				
//			}
//		}
//	}
	
	static void pairSum2(int arr[],int n ,int k) {
		//int sum=0;
		int hash[]=new int[100];
		for(int i=0;i<n;i++) {
			int index = k - arr[i];
			if(hash[index]==1){
				
					System.out.println("Pair is: " +arr[i]+" "+index);
					return;
				
				
			}
			hash[arr[i]] =1;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,5,6,3,6,8};
		int k=11;
		int n=arr.length;
		//pairSum1(arr,k,n);
		pairSum2(arr,n,k);

	}

}
