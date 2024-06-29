package region.back;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import region.back.domain.region.Dong;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
@Table
public class Review {
    @Id @GeneratedValue
    @Column(name = "review_id")
    private Long id;
    // 작성한 User
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    // 좋아요 누른 회원

    @ManyToOne
    @JoinColumn(name = "dong_id")
    private Dong dong;

    // 읍면동 Code
    private Long dongPk;
    private String content;
    private String image;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
