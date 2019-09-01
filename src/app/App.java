package app;

public class App {
  public static void main(String[] args) throws Exception {
    double val1 = 100.0;
    double val2 = 50.0;
    double result;
    char opCode = 'e';

    if (opCode == 'a') {
      result = val1 + val2;
    } else if (opCode == 's') {
      result = val1 - val2;
    } else if (opCode == 'm') {
      result = val1 * val2;
    } else if (opCode == 'd') {
      result = val1 / val2;
    } else {
      System.out.println("Error - invalid opCode!");
      result = 0.0;
    }

    System.out.println(result);
  }
}
