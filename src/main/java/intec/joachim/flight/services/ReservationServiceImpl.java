package intec.joachim.flight.services;

import intec.joachim.flight.data.Reservation;
import intec.joachim.flight.data.ReservationRequest;
import org.springframework.stereotype.Service;
import javax.management.relation.RelationService;
import javax.transaction.Transactional;


@Service
@Transactional
public class ReservationServiceImpl implements ReservationService {
    @Override
    public Reservation bookFlight(ReservationRequest reservationRequest) {
        return null;
    }
}
