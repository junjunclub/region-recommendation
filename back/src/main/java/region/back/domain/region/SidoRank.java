package region.back.domain.region;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table
public class SidoRank {
    @Id
    @GeneratedValue
    @Column(name = "sido_rank_id")
    private Long id;

    // 시/도에서 조회할 수 있게
    @OneToOne(mappedBy = "sidoRank")
    private Sido sido;

    private String sgisCode;
    private int wholePopulationRank;
    private int average_ageRank;
    private int populationDensityRank;
    private int agingIdxRank;
    private int apartmentRatioRank;
    private int rowhouseRatioRank;
    private int houseRatioRank;
    private int homePriceRank;
    private int subwayCntRank;
    private int elemSchoolsRank;
    private int midSchoolsRank;
    private int highSchoolsRank;
    private int cctvCntRank;
}
