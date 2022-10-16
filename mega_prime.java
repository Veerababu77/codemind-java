import java.util.Scanner;
class K
{   public static int isPrime(int x){
    int c=0;
    if(x<2){
        return 0;
    }
    for(int i=2;i<x;i++){
        if(x%i==0){
            c+=1;
            break;
        }
    }
    if(c==1)
    return 0;
    else
    return 1;
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        if(isPrime(s)==1){
            int r=0,z=0,k=0;
            while(s!=0){
                r=s%10;
                s=s/10;
                k+=1;
                if(isPrime(r)==1){
                    z+=1;
                }
            }
            if(k==z){
                System.out.println("Mega Prime");
            }
            else{
                System.out.println("Not Mega Prime");
            }
        }
        else{
            System.out.println("Not Mega Prime");
        }
    }
}