package region.back.domain.region;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class DongRank {
    @Id @GeneratedValue
    @Column(name = "dong_rank_id")
    private Long id;

    // 읍/면/동에서 조회할 수 있게
    @OneToOne(mappedBy = "dongRank")
    private Dong dong;

    private int dongCode;
    private int wholePopulationRank;
    private int average_ageRank;
    private int populationDensityRank;
    private int agingIdxRank;
    private int apartmentRatioRank;
    private int rowhouseRatioRank;
    private int houseRatioRank;
    private int homePriceRank;
    private int metroStationsRank;
    private int elemSchoolsRank;
    private int midSchoolsRank;
    private int highSchoolsRank;
    private int cctvCntRank;
}
