import java.io.*;
import java.util.*;
public class Armstrongnumber{
    
    public boolean checkNumber(int a){
        int temp=0;
        int rem=a;
        int newvalue=0;
        while(a>0){
             temp=a%10;
            a=a/10;
            newvalue=newvalue+(temp*temp*temp);
            System.out.println(newvalue);
        }
        if(newvalue==rem)
        {
            return true;
        }
        else
        return false;
    }
    
    
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the number");
        int a=sc.nextInt();
        Armstrongnumber asn=new Armstrongnumber();
        System.out.println("your value is "+asn.checkNumber(a));
    }
}