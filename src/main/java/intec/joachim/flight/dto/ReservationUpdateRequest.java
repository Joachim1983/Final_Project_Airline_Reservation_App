package intec.joachim.flight.dto;

//DTO, which stands for Data Transfer Object, is a design pattern conceived to reduce the number of calls when working with remote interfaces.

public class ReservationUpdateRequest {

    private Long id;
    private boolean checkedIn;
    private int numberOfBags;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }
}
