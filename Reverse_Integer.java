import java.util.Scanner;
class K
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int c=0,k=0,x=0;
        if(s<0){
            s=s*(-1);
            c+=1;
        }
        while(s!=0){
            k=s%10;
            s=s/10;
            x=x*10+k;
        }
        if(c==1){
            x=x*(-1);
            System.out.println(x);
        }
        else{
            System.out.println(x);
        }
    }
}