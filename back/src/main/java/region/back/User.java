package region.back;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
    private Long id;
    private String email;
    private String password;
    private Boolean isSuperUser;
    private String name;
    private String nickname;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<Region> interestedRegion = new ArrayList<>();
    private Boolean isSocialLogin;
}
