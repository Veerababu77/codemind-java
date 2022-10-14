import java.util.Scanner;
class Fib
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a=0,b=1,c=0;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=3;i<=s;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}