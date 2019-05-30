import java.util.*;
public class UglyNumber{

    public static int findUglyNumber(int n){
       int pos=1;
        for(int temp=2;temp<Integer.MAX_VALUE;temp++){
          int i=temp;
            while(i>1 && i%2 ==0){
            //    System.out.println("inside while loop");
               i=i/2;
              // System.out.println(i);
           }
           while(i>1 && i%3==0){
               i=i/3;
           }
           while(i>1 && i%5==0){
               i=i/5;
           }
           if(i==1){
               pos++;
               if(pos==n){
                   return temp;
               }
           }
       }
       return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //int arr[]={1,2,3,4,5,6,8,9,10,12,14,15,16,18};
        
        System.out.println("Enter the position for which you want the ugly number");
        int n=sc.nextInt();
        System.out.println("your ugly number at position is"+findUglyNumber(n));
    }

}