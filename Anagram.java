import java.util.*;
import java.io.*;

public class Anagram{

public boolean check(String string1,String string2){

    char char1[]=string1.toCharArray();
    char char2[]=string2.toCharArray();
    Arrays.sort(char1);
    Arrays.sort(char2);
    

    return Arrays.equals(char1, char2);
}

public static void main(String args[]){
    Anagram ana=new Anagram();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your first string");
    String string1=sc.nextLine();
    System.out.println("enter your second string");
    String string2=sc.nextLine();
    System.out.println(ana.check(string1, string2));
}

}