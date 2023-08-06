package orgmeanapi.domain.Routine;

import lombok.RequiredArgsConstructor;
import orgmeanapi.domain.Routine.controller.RoutineTotalRegisterRequest;
import orgmeanapi.domain.Routine.controller.RoutineTotalResponse;
import orgmeanapi.ragiar.annotation.Business;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Business
public class RoutineTotalBusiness {

    private final RoutineTotalService routineTotalService;
    private final RoutineTotalConverter routineTotalConverter;

    public RoutineTotalResponse register(
            RoutineTotalRegisterRequest routineTotalRegisterRequest
    ){
        // req -> entity -> response
        var entity = routineTotalConverter.toEntity(routineTotalRegisterRequest);
        var newEntity = routineTotalService.register(entity);
        var response = routineTotalConverter.toResponse(newEntity);
        return response;
    }








    public List<RoutineTotalResponse> searchregisterRouSum()//리스펀스 형태로 반환한다.
//                                                 String name
    {
        // entity list -> response list



        var storeList = routineTotalService.registerRou();

        return storeList.stream()
                .map(routineTotalConverter::toResponse)
                .collect(Collectors.toList());
    }
}

