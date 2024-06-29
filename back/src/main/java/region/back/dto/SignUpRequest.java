package region.back.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpRequest {
    private String email;
    private String password;
    private String confirmPassword;  // 비밀번호 확인 필드 추가
    private String name;
    private String nickname;
}