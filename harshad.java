import java.util.Scanner;
public class harshad{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,s=0,sum=0,temp=n;
        while(n>0){
            r=n%10;
            s=s+r;
            n=n/10;
            System.out.println(sum=s);
        }
        if(temp%sum==0)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}        
