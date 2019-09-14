package app;

public class MathEquation {
  private double leftVal;
  private double rightVal;
  private char opCode;
  private double result;

  public void execute() {
    switch (opCode) {
      case 'a':
        result = leftVal + rightVal;
        break;
      case 's':
        result = leftVal - rightVal;
        break;
      case 'm':
        result = leftVal * rightVal;
        break;
      case 'd':
        result = rightVal == 0.0 ? 0.0 : leftVal / rightVal;
        break;
      case 'l':
        result = leftVal % rightVal;
        break;
      default:
        System.out.println("Error - invalid opCode!");
        result = 0.0;
    }
  }
}
