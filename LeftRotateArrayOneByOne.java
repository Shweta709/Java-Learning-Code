package dsAlgoArray;

public class LeftRotateArrayOneByOne {
	
	public static void LeftArray(int arr[],int n) {
		int temp=arr[0];
	//int i=0;int j=arr.length-1;
	for(int i=0;i<n-1;i++) {
			//while(i!=j) {
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			
			
			}
			
			arr[n-1]=temp;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		LeftArray(arr,n);
		System.out.println("Array after rotation:");
		for(int i =0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
