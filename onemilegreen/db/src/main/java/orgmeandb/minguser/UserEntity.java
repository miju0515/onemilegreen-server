//package orgmeandb.minguser;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.experimental.SuperBuilder;
//import orgmeandb.minguser.enums.UserStatus;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "user")
//@Data
////@EqualsAndHashCode(callSuper = true)
//@NoArgsConstructor
//@AllArgsConstructor
//@SuperBuilder
//public class UserEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long userno;
//
//    @Column(nullable = false)
//    private String user_id;
//
//    @Column(nullable = false)
//    private String user_nick;
//
//    @Column(nullable = false)
//    private String useremail;
//
//    @Column(nullable = false)
//    private String userpwd;
//
//    @Column(nullable = false)
//    @Enumerated(EnumType.STRING)
//    private UserStatus status;
//
//    @Column(nullable = false)
//    private String district;
//
//    private int user_mileage;
//
//    private int user_effect;
//
//    private LocalDateTime registeredAt;
//
//
//
//}