import java.util.Scanner;

public class SelectionSort{

    public static int[] selectionSortImp(int arr[]){
        int temp=0;
        for(int i=0; i<arr.length;i++){
            int small=arr[i];
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(small>arr[j]){
                    small=arr[j];
                    minindex=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            //arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of values you want to insert");
        int number=sc.nextInt();
        int arr[]=new int[number];
        for(int i=0;i<number;i++){
            System.out.println("Enter the "+i+" value");
            arr[i]=sc.nextInt();
        }
        System.out.println("caling sort method");
        System.out.println("Printing number after sorting");
        arr=selectionSortImp(arr);
        System.out.println("Printing number after using bubble sorting");
        BubbleSort.bubbleSortImpl(arr);
    }

}