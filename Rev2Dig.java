import java.util.Scanner;

class Rev2Dig{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a 2-digit number: ");
        int num=sc.nextInt();
        int a=num%10;
         num=num/10;
        int b=num%10;
         num=num/10;
        System.out.println("After reversing your number= "+a +b );

    }
}