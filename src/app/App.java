package app;

public class App {
  public static void main(String[] args) throws Exception {
    double val1;
    double val2;
    double result;
    char opCode;

    if (opCode == 'a') {
      result = val1 + val2;
    } else if (opCode == 's') {
      result = val1 - val2;
    } else if (opCode == 'm') {
      result = val1 * val2;
    } else if (opCode == 'd') {
      result = val1 / val2;
    } else {
      throw new Exception("opCode not defined!");
    }

    System.out.println(result);
  }
}
