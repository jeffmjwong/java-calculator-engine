package app;

public class App {
  public static void main(String[] args) throws Exception {
    double[] leftVals = { 100.0, 25.0, 225.0, 11.0 };
    double[] rightVals = { 50.0, 92.0, 17.0, 3.0 };
    char[] opCodes = { 'd', 'a', 's', 'm' };
    double[] results = new double[opCodes.length];

    for (int i = 0; i < opCodes.length; i++) {
      switch (opCodes[i]) {
        case 'a':
          results[i] = leftVals[i] + rightVals[i];
          break;
        case 's':
          results[i] = leftVals[i] - rightVals[i];
          break;
        case 'm':
          results[i] = leftVals[i] * rightVals[i];
          break;
        case 'd':
          results[i] = rightVals[i] == 0.0 ? 0.0 : leftVals[i] / rightVals[i];
          break;
        default:
          System.out.println("Error - invalid opCode!");
          results[i] = 0.0;
          break;
      }
    }

    for (double theResult : results) {
      System.out.println(theResult);
    }
  }
}
