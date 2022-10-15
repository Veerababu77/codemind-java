import java.util.Scanner;
class Dig
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int x=0,r=0,c=0;
        while(s!=0){
            r=s%10;
            s=s/10;
            if(x<r){
                x=r;
            }
        }
        System.out.println(x);
    }
}