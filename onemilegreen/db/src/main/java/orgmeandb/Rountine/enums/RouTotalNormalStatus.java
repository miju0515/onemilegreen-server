package orgmeandb.Rountine.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum RouTotalNormalStatus {

    REGISTERED("모집중"),
    UNREGISTERED("마감"),
    ;

    private String description;
}
