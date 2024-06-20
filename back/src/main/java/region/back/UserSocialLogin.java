package region.back;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class UserSocialLogin {
    @Id @GeneratedValue
    private Long id;
    private User user;
    private SocialProvider socialProvider;
    private String providerUserId;
    private String accessToken;
    private String refreshToken;
    private String tokenExpiry;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
