import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();
        int m;
        if(a <= b)
            m=b;
        else
            m=a;
        if(m <= c){
            m = c;
            System.out.println("Maximum number is: " + c);
        }
        else
            System.out.println("Maximum number is: " + m);
    }

}

