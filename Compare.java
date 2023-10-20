//to print the greatest and smallest value
import java.util.Scanner;
class Compare{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 values: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b)
        {
                if(b<c){
                         System.out.println("C is greatest");
                    }
                    else{
                         System.out.println("B is greatest ");

                    }
                }
                if(b<a){
                     if(a<c){
                         System.out.println("C is greatest");
                    }
                    else{
                         System.out.println("A is greatest ");

                    }
                }
                }
            }
        
    