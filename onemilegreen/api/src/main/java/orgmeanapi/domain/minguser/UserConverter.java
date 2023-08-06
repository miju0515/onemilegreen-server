//package orgmeanapi.domain.minguser;
//
//import lombok.RequiredArgsConstructor;
//import orgmeanapi.ragiar.annotation.Converter;
//import orgmeanapi.ragiar.errors.ErrorCode;
//import orgmeanapi.ragiar.exception.ApiException;
//import orgmeanapi.domain.minguser.controller.model.UserRegisterRequest;
//import orgmeanapi.domain.minguser.controller.model.UserResponse;
//import orgmeandb.minguser.UserEntity;
//
//import java.util.Optional;
//
//@RequiredArgsConstructor
//@Converter
//public class UserConverter {
//
//    public UserEntity toEntity(UserRegisterRequest request){
//
//        return Optional.ofNullable(request)
//                .map(it ->{
//                    // to entity
//                    return UserEntity.builder()
//                            .user_nick(request.getUser_nick())
//                            .user_id(request.getUser_id())
//                            .useremail(request.getUseremail())
//                            .userpwd(request.getUserpwd())
//                            .district(request.getDistrict())
//                            .build();
//                })
//                .orElseThrow(()-> new ApiException(ErrorCode.NULL_POINT, "UserRegisterRequest Null"));
//    }
//
//    public UserResponse toResponse(UserEntity userEntity) {
//
//        return Optional.ofNullable(userEntity)
//                .map(it ->{
//                    // to response
//                    return UserResponse.builder()
//                            .userno(userEntity.getUserno())
//
//                            .user_id(userEntity.getUser_id())
//                            .user_nick(userEntity.getUser_nick())
//                            .status(userEntity.getStatus())
//                            .useremail(userEntity.getUseremail())
//                            .district(userEntity.getDistrict())
//                            .user_mileage(userEntity.getUser_mileage())
//                            .user_effect(userEntity.getUser_effect())
//                            .registeredAt(userEntity.getRegisteredAt())
//                            .build();
//                })
//                .orElseThrow(()-> new ApiException(ErrorCode.NULL_POINT, "UserEntity Null"));
//
//    }
//}
