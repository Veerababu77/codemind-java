import java.util.Scanner;
class k
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        //System.out.println(s);
        int w=s;
        int i=1;
        int c=0,x=0,y=0,z=1,v=0;
        while(s!=0){
            c=s%10;
            s=s/10;
            x=x*10+c;
        }
        while(x!=0){
            y=x%10;
            x=x/10;
            for(int a=1;a<=i;a++){
                z=z*y;
            }
            v+=z;
            //System.out.println(v);
            z=1;
            i+=1;
        }
        //System.out.println(v);
        if(v==w)
        System.out.println("True");
        else
        System.out.println("False");
    }
}