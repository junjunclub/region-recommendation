package region.back.domain.region;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class SidoInfo {
    @Id
    @GeneratedValue
    @Column(name = "sido_info_id")
    private Long id;

    // 시/도에서 조회할 수 있게
    @OneToOne(mappedBy = "sidoInfo")
    private Sido sido;

    private int sidoCode;
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
