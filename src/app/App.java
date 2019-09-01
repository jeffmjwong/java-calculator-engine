package app;

public class App {
  public static void main(String[] args) throws Exception {
    double[] leftVals = { 100.0, 25.0, 225.0, 11.0 };
    double[] rightVals = { 50.0, 92.0, 17.0, 3.0 };
    char[] opCodes = { 'd', 'a', 's', 'm' };
    double[] results = new double[opCodes.length];

    for (int i = 0; i < opCodes.length; i++) {
      if (opCodes[i] == 'a') {
        results[i] = leftVals[i] + rightVals[i];
      } else if (opCodes[i] == 's') {
        results[i] = leftVals[i] - rightVals[i];
      } else if (opCodes[i] == 'm') {
        results[i] = leftVals[i] * rightVals[i];
      } else if (opCodes[i] == 'd') {
        results[i] = rightVals[i] == 0.0 ? 0.0 : leftVals[i] / rightVals[i];
      } else {
        System.out.println("Error - invalid opCode!");
        results[i] = 0.0;
      }
    }

    for (double i : results) {
      System.out.println(i);
    }
  }
}
