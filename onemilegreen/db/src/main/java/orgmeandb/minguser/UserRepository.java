//package orgmeandb.minguser;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import orgmeandb.minguser.UserEntity;
//import orgmeandb.minguser.enums.UserStatus;
//
//import java.util.Optional;
//
//public interface UserRepository extends JpaRepository<UserEntity, Long> {
//
//    Optional<UserEntity> findFirstByuseremailAndUserpwdAndStatusOrderByUsernoDesc(String email, String password, UserStatus status);
//
//}
