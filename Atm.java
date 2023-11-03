import java.util.Scanner;

class Atm{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int bal=10000;
    System.out.println("Press 1: To check the balance ");
    System.out.println("Press 2: To deposite the balance ");
    System.out.println("Press 3: To withdraw money ");
    System.out.println("Please enter your choice: ");
    int a=sc.nextInt();
    switch (a) {
        case 1:
            System.out.println("Your current balance is: "+bal);
            break;
         case 2:
            System.out.println("Please enter the value you want to deposite: ");
            int dep=sc.nextInt();
            bal=dep+bal;
            System.out.println("Now your current balance is: "+bal);
            break;
         case 3:
           System.out.println("Please enter the value you want to withdraw: ");
            int wd=sc.nextInt();
            if (wd>bal) {
                System.out.println("Insufficient amount");
            }
            else{
            bal=bal-wd;
            System.out.println("Now your current balance is: "+bal);
            }
            break;

        default:
        System.out.println("Please enter a valid option");
            break;
    }   
}
}