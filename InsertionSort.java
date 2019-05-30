import java.util.*;
public class InsertionSort{
    public static void InsertionSortImpl(int []arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=i;j++){
                if(arr[i]<arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }   

        }
        System.out.println("Printing sorted array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want in array");
        int arr[]=new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the "+i+" number");
            arr[i]=sc.nextInt();
        }
        InsertionSortImpl(arr);
    }

}