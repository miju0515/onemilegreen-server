package orgmeanapi.domain.Routine.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import orgmeanapi.domain.Routine.RoutineTotalBusiness;
import orgmeanapi.ragiar.apis.Api;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/open-api/routinelistresiser")
public class RoutineTotalOpenApiController {

    private final RoutineTotalBusiness routineTotalBusiness;

    @PostMapping("/register")
    public Api<RoutineTotalResponse> register(
            @Valid
            @RequestBody Api<RoutineTotalRegisterRequest> request
    ){
        var response = routineTotalBusiness.register(request.getBody());
        return Api.OK(response);
    }
}

