import java.util.Scanner;
class Pro
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a=0,c=0;
        for(int i=1;i<s;i++){
            if((i*(i+1))==s){
                c+=1;
                break;
            }
            else if((i*(i+1))<s){
                continue;
            }
            else{
                a=a+1;
                break;
            }
        }
        if(c==1){
            System.out.println("YES");
        }
        else if(a==1){
            System.out.println("NO");
        }
    }
}