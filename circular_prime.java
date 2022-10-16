import java.util.Scanner;
class Pr
{   public static int isPrime(int x){
    int c=0;
    for(int i=2;i<x;i++){
        if(x%i==0){
            c+=1;
            break;
        }
    }
    if(c==1){
        return 0;
    }
    else{
        return 1;
    }
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        if(isPrime(s)==1){
            int k=0,v=0,z=0;
            k=s;
            while(k!=0){
                v=k%10;
                k=k/10;
                z=z*10+v;
            }
            if(isPrime(z)==1){
                System.out.println("circular prime");
            }
            else{
                System.out.println("prime but not a circular prime");
            }
        }
        else{
            System.out.println("not prime");
        }
        
    }
}