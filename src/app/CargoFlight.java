package app;

public class CargoFlight extends Flight {
  private int passengers;
  private int seats = 12;

  public int getSeats() {
    return this.seats;
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
