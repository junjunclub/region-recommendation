package region.back.domain.region;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Sido {
    @Id @GeneratedValue
    private Long id;
    private int sidoCode;
    private String sidoName;
    private float sidoLat;
    private float sidoLng;
}
