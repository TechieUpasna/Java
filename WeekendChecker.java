//program to check wether the weekday is weakend or not, using switch case
import java.util.Scanner;

class WeekendChecker{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Press 1 for Monday");
    System.out.println("Press 2 for Tuesday");
    System.out.println("Press 3 for Wednesday");
    System.out.println("Press 4 for Thursday");
    System.out.println("Press 5 for Friday");
    System.out.println("Press 6 for Saturday");
    System.out.println("Press 7 for Sunday");
    System.out.println("Please enter your choice: ");
    int a=sc.nextInt();
    switch(a){
        case 1:
        System.out.println("You choosed Monday and Monday is not a weekend");
        break;
        case 2:
        System.out.println("You choosed Tuesday and Tuesday is not a weekend");
        break;
        case 3:
        System.out.println("You choosed Wednesday and Wednesday is not a weekend");
        break;
        case 4:
        System.out.println("You choosed Thurday and Thursday is not a weekend");
        break;
        case 5:
        System.out.println("You choosed Friday and Friday is not a weekend");
        break;
        case 6:
        System.out.println("You choosed Saturday and Saturday is a weekend");
        break;
        case 7:
        System.out.println("You choosed Sunday and Sunday is a weekend");
        break;
        default:
        System.out.println("Please enter a valid option");
        break;

    }

}
}