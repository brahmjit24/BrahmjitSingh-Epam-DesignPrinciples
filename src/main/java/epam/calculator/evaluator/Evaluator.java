package epam.calculator.evaluator;

//------Evaluator---------
public class Evaluator{
  private double result;
  public Evaluator(){}
  //-----func. to evaluate expression-------
  public void evaluate(double num1,double num2,char expr)
  {
      switch(expr){
          case '+':result=num1+num2;break;
          case '-':result=num1-num2;break;
          case '*':result=num1*num2;break;
          case '/':result=num1/num2;break;
          default:
      }
  }
  //------func. to display results-------
  public void displayResult()
  {
      System.out.println("Result To the above is :"+result);
  }
}