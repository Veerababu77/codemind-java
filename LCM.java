import java.util.Scanner;
class K
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int x=sc.nextInt();
        int y=0,z=0,b=0;
        if(x<s)
        z=s;
        b=x;
        x=s;
        s=b;
        y=x;
        int c=2;
        if(x%s==0){
            System.out.println(x);
        }
        else{
            while(x%s!=0){
                x=y*c;
                c+=1;
                if(x<s)
                x=s;
            }
        }
        System.out.println(x);
    }
}