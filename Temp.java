import java.util.Scanner;
class Temp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter [F] to insert fehrenheit value or [C] to insert celsius value ");
        String a=sc.next();
        if(a.equals("F"))
        {
            System.out.println("Enter your fahrenheit value");
            int t=sc.nextInt();
            int r=(t - 32) * 5/9;
            System.out.println("Temperature in celsius= "+r);
        }
        else{
          System.out.println("Enter your celsius value");
            int t=sc.nextInt(); 
           int x= (t * 9/5) + 32;
           System.out.println("Temperature in Fehrenheit= "+x);  
        }



    }
}
