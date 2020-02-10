
package calculator;
//-----Impports Evaluator Class-----
import evaluator.Evaluator;
public class Calculator{
    private Evaluator evaluator;
    //-----constructor to create Evaluator object-----
    public Calculator(){
        evaluator=new Evaluator();
    }
    //-----solve function uses evalutor-----------
    public void solve(double num1,double num2,char expr) {
        evaluator.evaluate(num1, num2, expr);
        evaluator.displayResult();
    }
}