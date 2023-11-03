import java.util.Scanner;

public class SeasonCheck {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Press 1: for January");
    System.out.println("Press 2: for Feburary");
    System.out.println("Press 3: for March");
    System.out.println("Press 4: for April");
    System.out.println("Press 5: for May");
    System.out.println("Press 6: for June");
    System.out.println("Press 7: for July");
    System.out.println("Press 8: for August");
    System.out.println("Press 9: for September");
    System.out.println("Press 10: for October");
    System.out.println("Press 11: for November");
    System.out.println("Press 12: for December");
    System.out.println("Enter your month option");
    int a=sc.nextInt();
    switch (a) {
        case 11:
        case 12:
        case 1:
            System.out.println("Winter");
            break;
        case 6:
        case 7:
        case 5:
            System.out.println("Summer");
            break;
        case 2:
        case 3:
        case 4:
            System.out.println("Spring");
            break;

        case 10:
        case 9:
        case 8:
            System.out.println("Autumn");
            break;
    
        default:
        System.out.println("Please enter a valid option");
            break;
    }

    }
}
