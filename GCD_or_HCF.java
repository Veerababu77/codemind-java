import java.util.Scanner;
class Gcd
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=0;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0){
                if(x<i){
                    x=i;
                }
            }
        }
        System.out.println(x);
        
    }
}