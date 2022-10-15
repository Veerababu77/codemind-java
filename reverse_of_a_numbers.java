import java.util.Scanner;
class Adam
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int x=0,r=0,c=0;
        while(s!=0){
            r=s%10;
            s=s/10;
            c=c*10+r;
        }
        System.out.println(c);
    }
        
}
        