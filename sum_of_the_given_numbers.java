import java.util.Scanner;
class Sm
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        for(int i=1;i<=s;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a+b);
        }
    }
}