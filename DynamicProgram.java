import java.util.*;
public class DynamicProgram
{   
    public static int findUglyNum(int pos){
        int i2=0,i3=0,i5=0;
        
        int[] ugly=new int[150];
        ugly[0]=1;
        int nextoftwo=2;
        int nextofthree=3;
        int nextoffive=5;
        for(int i=1;i<150;i++){
            int nextugly=Math.min(nextoftwo, Math.min(nextofthree, nextoffive));
             ugly[i]=nextugly;
             if(nextugly==nextoftwo)
              {
            i2=i2+1;
            nextoftwo=ugly[i2]*2;
           //System.out.println("from array is "+ugly[i]);
        }
        if(nextugly==nextofthree)
        {
            i3=i3+1;
            nextofthree=ugly[i3]*3;
            //System.out.println("from array is "+ugly[i]);
        }
        if(nextugly==nextoffive)
        {
            i5=i5+1;
            nextoffive=ugly[i5]*5;
        }
        }
        return ugly[pos-1];

    }
 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the position at which you want the number");
        System.out.println("Your number at position is "+findUglyNum(sc.nextInt()));

    }
}