import java.util.*;
public class MakeAnagram{
 public static int removeChar(String s1,String s2){
     char []c1=s1.toCharArray();
     char []c2=s2.toCharArray();
    int i=0;
    int counter=0;
    int k=0;
    char temp;
     while(i<c1.length)
     {
         for(int j=k;j<c2.length;j++){
             if(c1[i]==c2[j]){
                 
                temp=c2[j];
                c2[j]=c2[k];
                c2[k]=temp;  
                 counter=counter+2;
                 k++;
                 break;
             }
         }
         i++;
     }
     return counter;
 }
 public static void main(String[] args){
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter first string");
     String s1=sc.nextLine();
     System.out.println("Enter second string");
     String s2=sc.nextLine();
     int result=s1.length()+s2.length()-removeChar(s1,s2);
     System.out.println("we have to delete "+result);
 }   
}