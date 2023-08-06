//package orgmeanapi.domain.minguser.controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import orgmeanapi.domain.minguser.UserBzness;
//import orgmeanapi.domain.minguser.controller.model.UserLoginRequest;
//import orgmeanapi.domain.minguser.controller.model.UserRegisterRequest;
//import orgmeanapi.domain.minguser.controller.model.UserResponse;
//import orgmeanapi.ragiar.apis.Api;
//
//import javax.validation.Valid;
//
//@RequiredArgsConstructor
//@RestController
//@RequestMapping("/open-api/user")
//public class UserEveryApiController {
//
//    private final UserBzness userBzness;
//
//
//    // 가입
//    @PostMapping("/register")
//    public Api<UserResponse> register(
//            @Valid
//            @RequestBody Api<UserRegisterRequest> request
//    ){
//        var response = userBzness.register(request.getBody());
//        return Api.OK(response);
//    }
//
//    // 로그인
//    @PostMapping("/login")
////    public Api<TokenResponse> login(
//    public Api<UserResponse> login(
//            @Valid
//            @RequestBody Api<UserLoginRequest> request
//    ){
//        var response = userBzness.login(request.getBody());
//        return Api.OK(response);
//    }
//
//}
