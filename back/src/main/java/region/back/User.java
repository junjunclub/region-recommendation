package region.back;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Getter @Setter
@Table(name = "users")  // 테이블 이름 명시적으로 설정
public class User implements UserDetails {
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

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserSocialLogin userSocialLogin;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        if (isSuperUser != null && isSuperUser) {
            authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        } else {
            authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        }
        return authorities;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}