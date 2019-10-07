package app.flight;

public class CargoFlight extends Flight {
  int passengers;
  double usedCargoSpace = 0.0;
  float maxCargoSpace = 1000.0f;

  public CargoFlight() {}

  public CargoFlight(int flightNumber) {
    super(flightNumber);
  }

  public CargoFlight(char flightClass) {
    super(flightClass);
  }

  public CargoFlight(int flightNumber, float maxCargoSpace) {
    this(flightNumber);
    this.maxCargoSpace = maxCargoSpace;
  }

  @Override
  public int getSeats() {
    return 12;
  }

  public int getPassengers() {
    return this.passengers;
  }

  public void add1Passenger() {
    if (hasSeating()) {
      passengers += 1;
    } else {
      handleTooMany();
    }
  }

  public boolean hasSeating() {
    return passengers < this.getSeats();
  }

  public void handleTooMany() {
    System.out.println("Flight is full!!");
  }

  public final void add1Package(float height, float width, float depth) {
    double size = height * width * depth;

    if (hasCargoSpace(size)) {
      usedCargoSpace += size;
    } else {
      handleNoSpace();
    }
  }

  private boolean hasCargoSpace(double size) {
    return usedCargoSpace + size <= maxCargoSpace;
  }

  private void handleNoSpace() {
    System.out.println("Not enough space!");
  }
}
