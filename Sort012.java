package dsAlgoArray;

public class Sort012 {
	 public static void sort012(int arr[],int n) {
	int count1=0, count2=0;
	int count3=0;
	
	for(int i=0;i<n;i++) {
		if(arr[i]==0)
		{
			count1++;
		}
			if(arr[i]==1) {
			 count2++;
		   }
		
		 if(arr[i]==2) {
				 count3++;
			}
		
			
		}
	for(int i=0;i<count1;i++) {
		arr[i]=0;
		}

	for(int i=count1;i<(count1+count2);i++) {
		arr[i]=1;
		}
	for(int i=(count1+count2);i<n;i++) {
		arr[i]=2;
		}
	
	printArray(arr,n);
		
	
}
	 public static void printArray(int arr[], int n) {
		 for(int i =0 ; i<n;i++) 
			 System.out.print( arr[i] + " ");
			 System.out.println();
		 
	 }

	public static void main(String args[]) {
		// TODO Auto-generated method stub

		int arr[]= {0,1,0,2,2,0,1,0};
		
		int n=arr.length;
		sort012(arr,n);
		
		}
	}


