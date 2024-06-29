package region.back;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@Table
public class SocialProvider {
    @Id @GeneratedValue
    @Column(name = "social_provider_id")
    private Long id;
    private String providerName;
    @OneToOne(mappedBy = "socialProvider")
    private UserSocialLogin userSocialLogin;
}
