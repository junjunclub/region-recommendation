package region.back;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
@Table
public class UserSocialLogin {
    @Id @GeneratedValue
    private Long id;

    @OneToOne(mappedBy = "userSocialLogin")
    private User user;
    private String providerUserId;
    private String accessToken;
    private String refreshToken;
    private String tokenExpiry;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @OneToOne
    @JoinColumn(name = "social_provider_id")
    private SocialProvider socialProvider;
}
