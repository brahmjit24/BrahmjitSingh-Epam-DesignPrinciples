package epam.calculator.calculator;

//-----Imports Evaluator Class-----
import epam.calculator.evaluator.*;
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