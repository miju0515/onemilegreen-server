package orgmeanapi.domain.Routine;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import orgmeanapi.ragiar.errors.ErrorCode;
import orgmeanapi.ragiar.exception.ApiException;
import orgmeandb.Rountine.RoutineTotalEntity;
import orgmeandb.Rountine.RoutineTotalRepository;
import orgmeandb.Rountine.enums.RouTotalNormalStatus;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class RoutineTotalService {

    private final RoutineTotalRepository routineTotalRepository;


//    public RoutineTotalEntity getRoutineWithThrow(Long id){//주문 들어오면 변경될꺼임.
//        return routineTotalRepository.findFirstByIdAndPositionOrderByIdDesc(id, RouTotalNormalStatus.REGISTERED)
//                .orElseThrow(()-> new ApiException(ErrorCode.NULL_POINT));
//    }


//    public LocalDate getStringToDate(String day) {
//
//        try {
//            return LocalDate.parse(day);
//        } catch (DateTimeParseException e) {
//            // 잘못된 형식의 날짜가 입력된 경우 처리
//            System.err.println("날짜 형식이 올바르지 않습니다. (예: yyyy-MM-dd 형식을 사용해주세요.)");
//        }
//        return null;
//    }


    // 스토어 등록
    public RoutineTotalEntity register(RoutineTotalEntity routineTotalEntity){
        return Optional.ofNullable(routineTotalEntity)
                .map(it ->{

                    it.setAttend(0);
                    it.setFavorit(0);
                    it.setPosition(RouTotalNormalStatus.REGISTERED);


                    return routineTotalRepository.save(it);
                })
                .orElseThrow(()-> new ApiException(ErrorCode.NULL_POINT));
    }





    // 전체 스토어
    public List<RoutineTotalEntity> registerRou(){
        var list = routineTotalRepository.findAllByPositionOrderByAttendDesc(RouTotalNormalStatus.REGISTERED);
        return list;
    }



}
