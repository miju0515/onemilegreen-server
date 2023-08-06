package orgmeanapi.domain.Routine;

import orgmeanapi.domain.Routine.controller.RoutineTotalRegisterRequest;
import orgmeanapi.domain.Routine.controller.RoutineTotalResponse;
import orgmeanapi.ragiar.annotation.Converter;
import orgmeanapi.ragiar.errors.ErrorCode;
import orgmeanapi.ragiar.exception.ApiException;
import orgmeandb.Rountine.RoutineTotalEntity;

import java.util.Optional;

@Converter
public class RoutineTotalConverter {

    public RoutineTotalEntity toEntity(//사용자에게 요청받은것 빌드
                                       RoutineTotalRegisterRequest request
    ){
        return Optional.ofNullable(request)
                .map(it ->{
                    return RoutineTotalEntity.builder()
                            .rou_name(request.getRou_name())
                            .rou_st_date(request.getRou_st_date())
                            .rou_end_date(request.getRou_end_date())
                            .rou_content(request.getRou_content())
                            .rou_mileage(request.getRou_mileage())
                            .rou_effect(request.getRou_effect())
                            .rou_dayofweek(request.getRou_dayofweek())


                            .build()
                            ;
                })
                .orElseThrow(() -> new ApiException(ErrorCode.NULL_POINT));
    }

    public RoutineTotalResponse toResponse(
            RoutineTotalEntity entity
    ){
        return Optional.ofNullable(entity)
                .map(it ->{
                    return RoutineTotalResponse.builder()
                            .id(entity.getId())
                            .rou_name(entity.getRou_name())
                            .rou_st_date(String.valueOf(entity.getRou_st_date()))
                            .rou_end_date(String.valueOf(entity.getRou_end_date()))
                            .attend(entity.getAttend())
                            .favorit(entity.getFavorit())
                            .rou_mileage(entity.getRou_mileage())
                            .rou_content(entity.getRou_content())
                            .rou_effect(entity.getRou_effect())
                            .rou_dayofweek(entity.getRou_dayofweek())
                            .rou_user_count(entity.getRou_user_count())

                            .build();
                })
                .orElseThrow(() -> new ApiException(ErrorCode.NULL_POINT));
    }
}
