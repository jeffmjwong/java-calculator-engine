package app;

public class Pilot {
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

  private boolean canAccept(Flight flight) {
    return true;
  }

  private void handleCantAccept() {
    System.out.println("Can't accept the flight!");
  }
}
