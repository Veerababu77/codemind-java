import java.util.Scanner;
class Adam
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int x=0;
        for(int i=1;i<=s;i++){
            if(i*i==s){
                System.out.println("True");
                break;
            }
            else if(i*i<s){
                continue;
            }
            else{
                System.out.println("False");
                break;
            }
        }
    }
}