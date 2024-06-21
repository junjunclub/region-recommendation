package region.back.domain.region;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import region.back.Review;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Dong {
    @Id @GeneratedValue
    @Column(name = "dong_id")
    private Long id;

    //동 상위인 시군구
    @ManyToOne
    @JoinColumn(name = "sigungu_id")
    private Sigungu sigungu;

    // 읍/면/동 상세정보
    @OneToOne
    @JoinColumn(name = "dong_info_id")
    private DongInfo dongInfo;

    // 읍/면/동 순위
    @OneToOne
    @JoinColumn(name = "dong_rank_id")
    private DongRank dongRank;

    private int dongCode;
    private String dongName;
    private float dongLat;
    private float dongLng;

    @OneToMany(mappedBy = "dong")
    private List<Review> reviews = new ArrayList<>();
}
