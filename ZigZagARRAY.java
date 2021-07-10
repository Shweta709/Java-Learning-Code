package dsAlgoArray;

public class ZigZagARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,7,6,1,5,9,10};
		int tem=0;
		boolean flag=true;
		for(int i=0;i<arr.length -1;i++)
		{
			if(flag) {
				if(arr[i] >arr[i+1]) {
					tem=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=tem;
				}
			}
			else if(arr[i] <arr[i+1]) {
				tem=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=tem;
		}
			flag =!flag;
			System.out.println("Zig zag: ");
			for(int a:arr) {
				System.out.print(a+ " ");
			}
	
	
	}

}
}
