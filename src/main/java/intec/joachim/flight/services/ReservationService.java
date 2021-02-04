package intec.joachim.flight.services;

import intec.joachim.flight.data.Reservation;
import intec.joachim.flight.data.ReservationRequest;

public interface ReservationService{

    public Reservation bookFlight(ReservationRequest reservationRequest);
}
