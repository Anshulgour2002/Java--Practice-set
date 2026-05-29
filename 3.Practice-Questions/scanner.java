import java.util.Scanner;
public class scanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter only Two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("The addition of two number is"+(num1+num2));

    }
    
}
