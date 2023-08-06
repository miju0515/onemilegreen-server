package orgmeandb.Rountine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import orgmeandb.Rountine.enums.RouTotalNormalStatus;

import javax.persistence.*;
import java.time.LocalDate;



@Data
@NoArgsConstructor
@AllArgsConstructor

@SuperBuilder
@Entity(name = "routinetotal")
@Table
public class RoutineTotalEntity{



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rou_id")
    private Long id;


    @Column(nullable = false)
    private String rou_name;

    @Column(nullable = false)
    private LocalDate rou_st_date;

    @Column(nullable = false)
    private LocalDate rou_end_date;

//    private int rou_status;

    private String rou_content;

    private int rou_mileage;

    private int rou_effect;

//    private String rou_effect_desc;

//    private String rou_pass_img;
//
//    private String rou_np_img;
//
//    private String rou_desc;

    private String rou_dayofweek;

    @Enumerated(EnumType.STRING)
    private RouTotalNormalStatus position;

    private int rou_user_count;

    @Column(name = "rou_attend")
    private int attend;

    private int favorit;



}
