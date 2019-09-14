package app;

public class App {
  public static void main(String[] args) throws Exception {
    // double[] leftVals = { 100.0, 25.0, 225.0, 11.0, 16.0 };
    // double[] rightVals = { 50.0, 92.0, 17.0, 3.0, 9.0 };
    // char[] opCodes = { 'd', 'a', 's', 'm', 'l' };
    // double[] results = new double[opCodes.length];

    MathEquation[] equations = new MathEquation[4];
    equations[0] = create(100.0d, 50.0d, 'd');
    equations[1] = create(25.0d, 92.0d, 'a');
    equations[2] = create(225.0d, 17.0d, 's');
    equations[3] = create(11.0d, 3.0d, 'm');

    for (MathEquation equation : equations) {
      equation.execute();

      System.out.print("result = ");
      System.out.println(equation.result);
    }
  }

  public static MathEquation create(double leftVal, double rightVal, char opCode) {
    MathEquation equation = new MathEquation();

    equation.leftVal = leftVal;
    equation.rightVal = rightVal;
    equation.opCode = opCode;

    return equation;
  }
}
