package region.back.domain.region;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table
public class SidoInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sido_info_id")
    private Long id;

    // 시/도에서 조회할 수 있게
    @OneToOne(mappedBy = "sidoInfo")
    private Sido sido;

    private String sgisCode;
    private int wholePopulation;
    private float average_age;
    private float populationDensity;
    private float agingIdx;
    private int apartmentCnt;
    private int rowhouseCnt;
    private int houseCnt;
    private int elemSchools;
    private int midSchools;
    private int highSchools;
    private int cctvCnt;
    private int subwayCnt;
    private float homePrice;
}
