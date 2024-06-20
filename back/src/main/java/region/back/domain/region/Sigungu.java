package region.back.domain.region;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Sigungu {
    @Id @GeneratedValue
    private Long id;
    private Sido sido;
    private int sidoCode;
    private int sigunguCode;
    private String sigunguName;
    private float sigunguLat;
    private float sigunguLng;
}
