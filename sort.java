public class sort{
	
	public static int partition(int[] arr,int low,int high){
	int i =low-1;
	int temp=0;
	int pivot=high;
	for(int j=low;j<=high;j++){
	
	if(arr[j]<=pivot){
	i++;
	temp=arr[j];
	arr[j]=arr[i];
	arr[i]=temp;
	}
	}
	temp=arr[i+1];
	arr[i+1]=arr[high];
	arr[high]=temp;
	return i+1;
	}
	
	public static void sorting(int []arr,int low,int high){
	if(low<high){
		int pi=partition(arr,low,high);		
		sorting(arr,low,pi-1);
		sorting(arr,pi+1,high);
	
	}
	}
	
	public static void main(String args[]){
	int arr[]={1,3,5,7,8,9,4,2,6,11};
	sorting(arr,0,9);
	for(int i:arr){
	System.out.println(i);
	}
	}


}