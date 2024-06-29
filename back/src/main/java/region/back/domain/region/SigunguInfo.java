package region.back.domain.region;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table
public class SigunguInfo {
    @Id
    @GeneratedValue
    @Column(name = "sigungu_info_id")
    private Long id;

    // 시/군/구에서 조회할 수 있게
    @OneToOne(mappedBy = "sigunguInfo")
    private Sigungu sigungu;

    private String sgisCode;
    private int wholePopulation;
    private float average_age;
    private float populationDensity;
    private float agingIdx;
    private float apartmentRatio;
    private float rowhouseRatio;
    private float houseRatio;
    private int apartmentCnt;
    private int rowhouseCnt;
    private int houseCnt;
    private float homePrice;
    private int subwayCnt;
    private int elemSchools;
    private int midSchools;
    private int highSchools;
    private int cctvCnt;
}
