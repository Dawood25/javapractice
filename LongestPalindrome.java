import java.io.*;
import java.util.*;

import javax.swing.text.Highlighter.Highlight;

public class LongestPalindrome{
    public int Findpalindrome(String string){
        String[] s =new String[string.length()];
        int maxLength=1;
        int start =0;
        int length=string.length();
        int low=0;
        int high=1;

        for(int i=1;i<length;++i){
            low=i-1;
            high=i;

            while(low>=0 && high<length && (string.charAt(low)==string.charAt(high))){
                if(high-low+1>maxLength){
                    start=low;
                    maxLength=high-low+1;
                    
                }
                --low;
                ++high;
            }
            low =i-1;
            high=i+1; 
            while(low>=0 && high<length && (string.charAt(low)==string.charAt(high))){
                if(high-low+1>maxLength){
                    start=low;
                    maxLength=high-low+1;
                }
                --low;
                ++high;
            }

        }
        return maxLength;
    } 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        LongestPalindrome lp=new LongestPalindrome();
        System.out.println("longets palindrome is "+lp.Findpalindrome(string));  
            
    }
}