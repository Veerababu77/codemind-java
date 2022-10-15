import java.util.Scanner;
class Pri
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int c=0;
        for(int i=2;i<s;i++){
            if(s%i==0){
                c+=1;
                System.out.println("not a prime");
                break;
            }
            
        }
        if(c==0){
            System.out.println("prime");
        }
    }
}