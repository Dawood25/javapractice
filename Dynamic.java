import java.util.Scanner;

public class Dynamic{    
    int lookup[][];
    public int fibonacci(int num,int[][] lookup){
        if(num<=1)
        return num;
        if(lookup[num][2]!=0){
            return lookup[num][2];
        }
        lookup[num][2]=fibonacci(num-1, lookup)+fibonacci(num-2, lookup);
        return lookup[num][2];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter number");
        int num=sc.nextInt();
        Dynamic dyn=new Dynamic();
        dyn.lookup=new int[num+1][3];
        System.out.println(dyn.lookup.length);
        dyn.fibonacci(num,dyn.lookup);

    }

}