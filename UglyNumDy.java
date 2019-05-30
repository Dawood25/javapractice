import java.util.*;

public class UglyNumDy{
    public static int findUglyNum(int pos){
        int arr[]=new int[150];
        arr[0]=1;
        int i2=0;
        int i3=0;
        int i5=0;
        int nextof2=2;
        int nextof3=3;
        int nextof5=5;
        for(int i=1;i<150;i++){
            int nextugly=Math.min(nextof2,Math.min(nextof3,nextof5));
            arr[i]=nextugly;
            if(nextugly==nextof2){
            i2=i2+1;
            nextof2=arr[i2]*2;
        }
        if(nextugly==nextof3){
            i3=i3+1;
            nextof3=arr[i3]*3;
        }
        if(nextugly==nextof5){
            i5=i5+1;
            nextof5=arr[i5]*5;
        }
        System.out.println(arr[i]);
        }
        //System.out.println(arr[i]);
        return arr[pos];
    }


    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the pos at which you want ugly num");
        int pos=sc.nextInt();
        System.out.println("your ugly num at pos is ."+findUglyNum(pos));
    }
}