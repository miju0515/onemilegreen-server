package orgmeanapi.domain.Routine.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import orgmeandb.Rountine.enums.RouTotalNormalStatus;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
//고객에게 요청
public class RoutineTotalRegisterRequest {




    @NotBlank
    private String rou_name;

    @NotBlank
    private LocalDate rou_st_date;
    @NotBlank
    private LocalDate rou_end_date;

    @NotNull
    private int rou_mileage;

    @NotBlank
    private String rou_content;


    @NotNull

    private int rou_effect;

    @NotBlank
    private String rou_dayofweek;

    private RouTotalNormalStatus position;
















}
