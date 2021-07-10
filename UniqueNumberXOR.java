package dsAlgoArray;

public class UniqueNumberXOR {
	public static void UniqueId(int arr[]) {
		int x = 0;
		for(int i = 0; i < arr.length; i++) {
			x = x ^arr[i];
		}
		System.out.println(x);
//		x= ( x & -x);
//		
//		int sum1=0;
//		int sum2=0;
//		for(int i=0;i<arr.length;i++) {
//			if((arr[i]&x)>0) {
//				sum1=(sum1^arr[i]);
//			}
//			
//			else
//			{
//				sum2 =(sum2^arr[i]);
//			}
//		}
//		
//		System.out.println("Unique elements is: "+sum1+ " "+ sum2);
//	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,3,6,2,3,6};
		//int n=arr.length;
		
		UniqueId(arr);

	}

}
