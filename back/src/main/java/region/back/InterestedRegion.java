package region.back;

import jakarta.persistence.*;
import region.back.domain.region.Dong;
import java.time.LocalDateTime;

@Entity
public class InterestedRegion {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "dong_id")
    private Dong dong;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
