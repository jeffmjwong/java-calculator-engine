package app;

public class Flight {
  int passengers = 0;
  private int flightNumber;
  private int flightClass;

  public Flight() {}

  public Flight(int flightNumber) {
    this.flightNumber = flightNumber;
  }

  public Flight(char flightClass) {
    this.flightClass = flightClass;
  }

  @Override
  public boolean equals(Object obj1) {
    if (super.equals(obj1)) {
      return true;
    }

    if (!(obj1 instanceof Flight)) {
      return false;
    }

    Flight obj2 = (Flight) obj1;
    return obj2.getFlightNumber() == this.flightNumber && obj2.getFlightClass() == this.flightClass;
  }

  public int getFlightNumber() {
    return this.flightNumber;
  }

  public int getFlightClass() {
    return this.flightClass;
  }

  public int getSeats() {
    return 150;
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
    return passengers < getSeats();
  }

  public void handleTooMany() {
    System.out.println("Flight is full!!");
  }
}
