package region.back.domain.region;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class DongInfo {

    @Id @GeneratedValue
    @Column(name = "dong_info_id")
    private Long id;

    // 읍/면/동에서 조회할 수 있게
    @OneToOne(mappedBy = "dongInfo")
    private Dong dong;

    private int dongCode;
    private int wholePopulation;
    private float average_age;
    private float populationDensity;
    private float agingIdx;
    private float apartmentRatio;
    private float rowhouseRatio;
    private float houseRatio;
    private float homePrice;
    private int metroStations;
    private int elemSchools;
    private int midSchools;
    private int highSchools;
    private int cctvCnt;
}
