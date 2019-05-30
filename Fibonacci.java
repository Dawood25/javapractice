import java.util.*;

public class Fibonacci
{
    public int fibonacci(int num){
        int fibon=num;
        if(num<=1){
           return 1;
        }
        
        return this.fibonacci(fibon-1)+this.fibonacci(fibon-2);
        
        }

    public static void main(String args[]){
        System.out.println("Enter the number you want in fibonacci series");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Fibonacci fib=new Fibonacci();
        int no=fib.fibonacci(num);
        System.out.println(no);
    }
}