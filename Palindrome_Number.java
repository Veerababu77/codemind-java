import java.util.Scanner;
class K
{   public static int isPali(int x){
    int k=0,y=0,z=0;
    k=x;
    while(k!=0){
        y=k%10;
        k=k/10;
        z=z*10+y;
    }
    if(z==x){
        return 1;
    }
    else{
        return 0;
    }
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        for(int i=1;i<=s;i++){
            int a=sc.nextInt();
            if(isPali(a)==1){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }
}