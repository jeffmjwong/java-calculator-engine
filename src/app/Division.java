package app;

public class Division extends CalculateBase {
  public Division() {}

  public Division(double leftVal, double rightVal) {
    super(leftVal, rightVal);
  }

  @Override
  public void calculate() {
    double value = getLeftVal() / getRightVal();
    setResult(value);
  }
}
