package app.flight;

public class CargoOnlyPilot extends Pilot {
  @Override
  public boolean canAccept(Flight flight) {
    return flight.getPassengers() == 0;
  }
}
