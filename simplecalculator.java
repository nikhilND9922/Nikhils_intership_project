import java.util.Scanner;

public class simplecalculator {
    public static double add(double a,double b)
    {
       return a+b;
    }
    public static double sub(double a,double b){
        return a-b;
    }
    public static double multi(double a,double b){
        return a*b;
    }
    public static double div(double a,double b){
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
            else{
                return a/b;
            }

    }
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1=scanner.nextDouble();


        System.out.println("choose an perator: +,-,*,/");
        char operation=scanner.next().charAt(0);

        System.out.println("Enter second number:");
        double num2=scanner.nextDouble();


        double result=0;
        switch (operation){
            case '+':
                result=add(num1,num2);
                break;
            case '-':
                result=sub(num1,num2);
                break;
            case '*':
                result=multi(num1,num2);
                break;
            case '/':
                result=div(num1,num2);
                break;
            default:
                System.out.println("Invalid operation selected.");
                return;


        }

        System.out.println("the result of tje operation is:"+ result);

    }

}
