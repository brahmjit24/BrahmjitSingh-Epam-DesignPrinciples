package epam.calculator;

/**
 * Hello world!
 *
 */
import java.util.*;
import epam.calculator.calculator.*;
//------Main function is here-----
public class App{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double num1=0;double num2=0;char expr;
        //------Scanning Inputs----------
        System.out.println("Enter First Number");
        num1=scan.nextDouble();
        System.out.println("Enter Second Number");
        num2=scan.nextDouble();
        System.out.println("Enter operation(+,-,*,/) to perform :");
        expr=scan.next().charAt(0);
        //-----Creating Calculator object------
        Calculator calculator=new Calculator();
        //----calling solve method in calculator-----    
        calculator.solve(num1,num2,expr);
        scan.close();
    }
}