package region.back;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import region.back.domain.region.Dong;
import java.time.LocalDateTime;

@Entity
@Table
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
