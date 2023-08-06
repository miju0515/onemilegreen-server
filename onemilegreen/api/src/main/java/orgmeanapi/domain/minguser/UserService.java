//package orgmeanapi.domain.minguser;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import orgmeanapi.ragiar.errors.ErrorCode;
//import orgmeanapi.ragiar.errors.UserErrorCode;
//import orgmeanapi.ragiar.exception.ApiException;
//import orgmeandb.minguser.UserEntity;
//import orgmeandb.minguser.UserRepository;
//import orgmeandb.minguser.enums.UserStatus;
//
//import java.time.LocalDateTime;
//import java.util.Optional;
//
//@RequiredArgsConstructor
//@Service
//public class UserService {
//
//    private final UserRepository userRepository;
//
//    public UserEntity login(String useremail, String userpwd) {
//        return getUserWithThrow(useremail, userpwd);
//    }
//
//    public UserEntity register(UserEntity userEntity) {
//        if (userEntity == null) {
//            throw new ApiException(ErrorCode.NULL_POINT, "users Null entity");
//        }
//        userEntity.setStatus(UserStatus.REGISTERED);
//        userEntity.setRegisteredAt(LocalDateTime.now());
//        return userRepository.save(userEntity);
//    }
//
//    public UserEntity getUserWithThrow(String useremail, String userpwd) {
//        return userRepository.findFirstByuseremailAndUserpwdAndStatusOrderByUsernoDesc(
//                useremail,
//                userpwd,
//                UserStatus.REGISTERED
//        ).orElseThrow(() -> new ApiException(UserErrorCode.USER_NOT_FOUND));
//    }
//
//
//
//}
