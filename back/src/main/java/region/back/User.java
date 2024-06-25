package region.back;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.swing.plaf.synth.Region;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class User {
    @Id @GeneratedValue
    @Column(name = "user_id")
    private Long id;
    private String email;
    private String password;
    private Boolean isSuperUser;
    private String name;
    private String nickname;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // 작성한 리뷰
    @OneToMany(mappedBy = "user")
    private List<Review> reviews = new ArrayList<>();

    // 관심지역
    @OneToMany(mappedBy = "user")
    private List<InterestedRegion> interestedRegion = new ArrayList<>();
    private Boolean isSocialLogin;
}
