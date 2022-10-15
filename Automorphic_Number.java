import java.util.Scanner;
class Auto
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int x=0,r=0,c=0,y=0,z=0,a=0,b=0,k=0;
        x=s*s;
        k=s;
        while(s!=0){
            r=s%10;
            s=s/10;
            c+=1;
        }
        for(int i=1;i<=c;i++){
            y=x%10;
            x=x/10;
            z=z*10+y;
        }
        while(z!=0){
            a=z%10;
            z=z/10;
            b=b*10+a;
        }
        //System.out.print(k+" ");
        //System.out.print(b);
        if(k==b){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not an Automorphic Number");
        }
    }
}