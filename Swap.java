import java.util.Scanner;
class Swap{
    public static void main(String[] arg){

    
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter 2 variables: ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    //using arithmetic operators
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("a="+a) ;
    System.out.println("b="+b) ;
    a=a*b;
    b=a/b;
    a=a/b;
     System.out.println("a="+a) ;
    System.out.println("b="+b) ;
    //using bitwise operator
    a=a^b;
    b=a^b;
    a=a^b;
     System.out.println("a="+a) ;
    System.out.println("b="+b) ;

}
}