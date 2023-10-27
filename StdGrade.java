import java.util.Scanner;

class StdGrade{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter your marks: ");
    int marks=sc.nextInt();
    if(marks>=90 && marks<=100){
        System.out.println("A");
    }
    if(marks>=80 && marks<=89){
        System.out.println("B");
    }
    if(marks>=70 && marks<=79){
        System.out.println("C");
    }
    if(marks>=60 && marks<=69){
        System.out.println("D");
    }
    if(marks>=0 && marks<=59){
        System.out.println("F");
    }
    }
}