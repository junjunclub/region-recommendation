package region.back.domain.region;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Sigungu {
    @Id @GeneratedValue
    @Column(name = "sigungu_id")
    private Long id;

    // 시/군/구 상위인 시도
    @ManyToOne
    @JoinColumn(name = "sido_id")
    private Sido sido;

    // 시/군/구 상세정보
    @OneToOne
    @JoinColumn(name = "sigungu_info_id")
    private SigunguInfo sigunguInfo;

    // 시/군/구 순위
    @OneToOne
    @JoinColumn(name = "sigungu_rank_id")
    private SigunguRank sigunguRank;

    // 시/군/구 하위인 읍/면/동
    @OneToMany(mappedBy = "sigungu")
    private List<Dong> dongs = new ArrayList<>();

    private int sigunguCode;
    private String sigunguName;
    private float sigunguLat;
    private float sigunguLng;
}
