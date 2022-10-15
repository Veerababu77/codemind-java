import java.util.Scanner;
class Adam
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int x=0,r=0,c=0,k=0,y=0,z=0;
        x=s*s;
        while(s!=0){
            r=s%10;
            s=s/10;
            c=c*10+r;
        }
        k=c*c;
        while(k!=0){
            y=k%10;
            k=k/10;
            z=z*10+y;
        }
        if(x==z){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}