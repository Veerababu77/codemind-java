import java.util.Scanner;
class K
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int p=s;
        int c=0,x=0;
        while(s!=0){
            c=s%10;
            s=s/10;
            x=x*10+c;
        }
        if(x==p)
        System.out.println("True");
        else
        System.out.println("False");
    }
}