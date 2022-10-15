import java.util.Scanner;
class Ami
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0,s=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                c+=i;
            }
        }
        for(int j=1;j<b;j++){
            if(b%j==0){
                s+=j;
            }
        }
        if(s==a && c==b){
            System.out.println("Amicable");
        }
        else{
            System.out.println("Not Amicable");
        }
    }
}