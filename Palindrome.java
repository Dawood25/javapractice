import java.util.*;
import java.io.*;
public class Palindrome{
public boolean check(String a){
    char arr[]=a.toCharArray();
    int size=a.length();
    for(int i=0;i<size/2;i++){
        if(arr[i]!=a.charAt(size-1-i)){
            return false;
        }
    }
    return true;
}
public static void main(String args[]){
    Palindrome pd=new Palindrome();
    Scanner sc =new Scanner(System.in);
    String a=sc.nextLine();
    System.out.println("your string is palindrome   "+pd.check(a));
}

}
