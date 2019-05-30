import java.util.*;
public class LCS{
    public static int findLCS(char[] X,char[] Y,int m,int n){
        if(m==0 || n==0)
        return 0;
        if(X[m-1]==Y[n-1]){
            return 1+findLCS(X, Y,m-1,n-1);
        }
        return Math.max(findLCS(X, Y,m-1,n), findLCS(X, Y,m,n-1));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string");
        String string1= sc.next();
        System.out.println("Enter the second string");
        String string2=sc.next();
        char[] X=string1.toCharArray();
        char[] Y=string2.toCharArray();
        int m=X.length;
        int n=Y.length;
        System.out.println(findLCS(X,Y,m,n));


    }


}