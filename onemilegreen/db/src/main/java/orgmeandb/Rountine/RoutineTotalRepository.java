package orgmeandb.Rountine;



import orgmeandb.Rountine.enums.RouTotalNormalStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RoutineTotalRepository extends JpaRepository<RoutineTotalEntity, Long> {



    Optional<RoutineTotalEntity> findFirstByIdAndPositionOrderByIdDesc(Long id, RouTotalNormalStatus status);



    List<RoutineTotalEntity> findAllByPositionOrderByIdDesc(RouTotalNormalStatus status);

    List<RoutineTotalEntity> findAllByPositionOrderByAttendDesc(RouTotalNormalStatus status);





}
