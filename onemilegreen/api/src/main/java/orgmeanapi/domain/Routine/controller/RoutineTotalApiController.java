package orgmeanapi.domain.Routine.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import orgmeanapi.domain.Routine.RoutineTotalBusiness;
import orgmeanapi.domain.Routine.controller.RoutineTotalResponse;
import orgmeanapi.ragiar.apis.Api;

import java.util.List;



    @RequiredArgsConstructor
    @RestController
    @RequestMapping("/api/routine")
    public class RoutineTotalApiController {


        private final RoutineTotalBusiness routineTotalBusiness;

        @GetMapping("/search")
        public Api<List<RoutineTotalResponse>> search(

        ){
            var response = routineTotalBusiness.searchregisterRouSum();
            return Api.OK(response);
        }



}
