import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Hangi sayının mükemmel sayı olup olmadığını araştırmak istiyorsunuz : ");
        int n = sc.nextInt();

        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n) {
            System.out.println(n+" mükemmel sayıdır.");
        }
        else{
            System.out.println(n+" mükemmel sayı değildir.");
        }
    }
}
