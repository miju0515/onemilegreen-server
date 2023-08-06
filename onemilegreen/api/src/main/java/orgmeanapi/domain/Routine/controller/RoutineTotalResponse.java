package orgmeanapi.domain.Routine.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//엔티티 데이터 타입에 저장
public class RoutineTotalResponse {


    private Long id;

    private String rou_name;


    @Column(nullable = false)
    private String rou_st_date;


    @Column(nullable = false)
    private String rou_end_date;


    private int rou_mileage;


    private String rou_content;


    private int rou_effect;


    private String rou_dayofweek;

    private int rou_user_count;


    private int favorit;

    private int attend;





}
