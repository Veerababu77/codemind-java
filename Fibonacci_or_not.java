import java.util.Scanner;
class fib
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a=0,b=1,c=0;
        for(int i=1;i<=s;i++){
            c=a+b;
            if(c==s){
                System.out.println("True");
                break;
            }
            else if(c<s){
                a=b;
                b=c;
                continue;
            }
            else{
                System.out.println("False");
                break;
            }
        }
    }
}