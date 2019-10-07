package app;

import app.flight.Flight;
import app.flight.CargoFlight;

public class App {
  public static void main(String[] args) throws Exception {
    Flight f1 = new Flight(175);
    System.out.println("My flight is " + f1);
    // Flight f2 = new Flight(175);
    // CargoFlight f3 = new CargoFlight(500, 200.0f);
    // Passenger p1 = new Passenger();

    // System.out.println(f1.equals(f2));
    // System.out.println(f1.equals(f3));

    // MathEquation[] equations = new MathEquation[4];
    // equations[0] = create(100.0d, 50.0d, 'd');
    // equations[1] = create(25.0d, 92.0d, 'a');
    // equations[2] = create(225.0d, 17.0d, 's');
    // equations[3] = create(11.0d, 3.0d, 'm');

    // for (MathEquation equation : equations) {
    //   equation.execute();

    //   System.out.print("result = ");
    //   System.out.println(equation.getResult());
    // }

    // System.out.println();
    // System.out.println("Using overloads");
    // System.out.println();

    // MathEquation equationOverload = new MathEquation('d');
    // equationOverload.execute(36, 8);

    // System.out.print("result = ");
    // System.out.println(equationOverload.getResult());

    System.out.println();
    System.out.println("Using inheritance:");
    System.out.println();

    CalculateBase[] calculators = {
      new Adder(25.0d, 92.0d),
      new Subtracter(225.0d, 17.0d),
      new Multiplier(11.0d, 3.0d),
      new Divider(100.0d, 50.d)
    };

    for (CalculateBase calculator : calculators) {
      calculator.calculate();
      System.out.println(calculator.getResult());
    }
  }

  public static MathEquation create(double leftVal, double rightVal, char opCode) {
    MathEquation equation = new MathEquation();

    equation.setLeftVal(leftVal);
    equation.setRightVal(rightVal);
    equation.setOpCode(opCode);

    return equation;
  }
}
