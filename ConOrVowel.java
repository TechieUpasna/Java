import java.util.Scanner;
class ConOrVowel{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character: ");
        char c=sc.next().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.println("Character is vowel");
        }
        else{
             System.out.println("Character is Constant");
        }
    }
}