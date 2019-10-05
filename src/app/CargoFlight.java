package app;

public class CargoFlight extends Flight {
  int passengers;

  public CargoFlight(int flightNumber) {
    super(flightNumber);
  }

  public CargoFlight(char flightClass) {
    super(flightClass);
  }

  @Override
  public int getSeats() {
    return 12;
  }

  public int getPassengers() {
    return this.passengers;
  }

  // public void add1Passenger() {
  //   if (hasSeating()) {
  //     passengers += 1;
  //   } else {
  //     handleTooMany();
  //   }
  // }

  // public boolean hasSeating() {
  //   return passengers < seats;
  // }

  // public void handleTooMany() {
  //   System.out.println("Flight is full!!");
  // }
}
