package app;

public class App {
  public static void main(String[] args) throws Exception {
    double val1 = 100.0;
    double val2 = 50.0;
    double result;
    char opCode = 'd';

    switch (opCode) {
      case 'a':
        System.out.println("hello!");
        System.out.println("hmm!");
      case 'd':
        System.out.println("oi!");
        opCode = 'e';
        break;
      case 'e':
        System.out.println("lol this is not right");
    }

    // double[] arr1 = {2.5, 3.5, 5.5};
    // double sum = 0.0;
    // for (double i : arr1) {
    //   sum += i;
    // }
    // System.out.println(sum);

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
