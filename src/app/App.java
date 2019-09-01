package app;

public class App {
  public static void main(String[] args) throws Exception {
    double val1 = 100.0;
    double val2 = 0.0;
    double result;
    char opCode = 'd';

    for (double i = val1; i > 1; i -= 30) {
      System.out.println(i);
    }

    // if (opCode == 'a') {
    //   result = val1 + val2;
    // } else if (opCode == 's') {
    //   result = val1 - val2;
    // } else if (opCode == 'm') {
    //   result = val1 * val2;
    // } else if (opCode == 'd') {
    //   result = val2 == 0.0 ? 0.0 : val1 / val2;
    // } else {
    //   System.out.println("Error - invalid opCode!");
    //   result = 0.0;
    // }

    // System.out.println(result);
  }
}
