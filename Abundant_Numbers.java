import java.util.Scanner;
class K
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int c=0;
        for(int i=1;i<s;i++){
            if(s%i==0)
            c+=i;
        }
        //System.out.print(s);
        //System.out.print(c);
        if(c>s)
        System.out.println("True");
        else
        System.out.println("False");
        
    }
}