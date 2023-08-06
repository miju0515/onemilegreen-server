//package orgmeanapi.domain.minguser;
//
//
//import orgmeanapi.ragiar.annotation.Business;
////import org.mean.api.domain.token.business.TokenBzness;
////import org.mean.api.domain.token.controller.model.TokenResponse;
//import orgmeanapi.domain.minguser.controller.model.UserLoginRequest;
//import orgmeanapi.domain.minguser.controller.model.UserRegisterRequest;
//import orgmeanapi.domain.minguser.controller.model.UserResponse;
//import orgmeanapi.domain.minguser.model.User;
//import orgmeandb.minguser.UserEntity;
//
//@Business
//public class UserBzness {
//
//    private final UserService userService;
//    private final UserConverter userConverter;
//
//    public UserBzness(UserService userService, UserConverter userConverter) {
//        this.userService = userService;
//        this.userConverter = userConverter;
//    }
//
//    public UserResponse register(UserRegisterRequest request) {
//        UserEntity usernewentity = userConverter.toEntity(request);
//        UserEntity newEntity = userService.register(usernewentity);
//        return userConverter.toResponse(newEntity);
//    }
//
//    public UserResponse login(UserLoginRequest request) {
//        UserEntity userEntity = userService.login(request.getUseremail(), request.getUserpwd());
//        return userConverter.toResponse(userEntity);
//    }}
