package region.back.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {
    private String email;  // 이메일로 변경
    private String password;
}