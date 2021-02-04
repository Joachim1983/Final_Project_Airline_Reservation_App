package intec.joachim.flight.data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reservation {

    //variables
    @Id
    private int id;
    private int numberOfBags;
    private boolean checkedInAlready;
    private Passenger passenger;
    private Flight flight;

    //getters & setters
    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    public boolean isCheckedInAlready() {
        return checkedInAlready;
    }

    public void setCheckedInAlready(boolean checkedInAlready) {
        this.checkedInAlready = checkedInAlready;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    //method used for output on screen

    @Override
    public String toString() {
        return "Reservation{" +
                "numberOfBags=" + numberOfBags +
                ", checkedInAlready=" + checkedInAlready +
                ", passenger=" + passenger +
                ", flight=" + flight +
                '}';
    }
}
