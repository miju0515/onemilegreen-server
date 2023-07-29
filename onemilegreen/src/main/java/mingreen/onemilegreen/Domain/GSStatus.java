package mingreen.onemilegreen.Domain;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GSStatus {
    private int districtTotalMileage;
    private int districtTotalEffect;
    private int districtTotalUser;
    private int districtRangking;
    private String districtName;
    private int userMileage;
    private int userEffect;
    private int seoulTotalMileage;
    private int seoulTotalEffect;
    private int seoulTotalUser;
}
