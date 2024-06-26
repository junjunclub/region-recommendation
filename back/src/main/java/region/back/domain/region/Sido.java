package region.back.domain.region;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Sido {
    @Id @GeneratedValue
    private Long id;

    // 시/도 상세정보
    @OneToOne
    @JoinColumn(name = "sido_info_id")
    private SidoInfo sidoInfo;

    // 시/도 순위
    @OneToOne
    @JoinColumn(name = "sido_rank_id")
    private SidoRank sidoRank;

    // 시/도 하위에 있는 시군구
    @OneToMany(mappedBy = "sido")
    private List<Sigungu> sigungus = new ArrayList<>();

    private int sidoCode;
    private String sidoName;
    private float sidoLat;
    private float sidoLng;
}
