package app;

public abstract class Pilot {
  private Flight currentFlight;

  public Flight getCurrentFlight() {
    return this.currentFlight;
  }

  public void fly(Flight flight) {
    if (canAccept(flight)) {
      this.currentFlight = flight;
    } else {
      handleCantAccept();
    }
  }

  public abstract boolean canAccept(Flight flight);

  private void handleCantAccept() {
    System.out.println("Can't accept the flight!");
  }
}
