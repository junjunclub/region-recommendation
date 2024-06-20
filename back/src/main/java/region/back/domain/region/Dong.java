package region.back.domain.region;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Dong {
    @Id @GeneratedValue
    private Long id;
    private Sigungu sigungu;
    private Sido sido;
    private int sigunguCode;
    private int dongCode;
    private String dongName;
    private float dongLat;
    private float dongLng;
}
