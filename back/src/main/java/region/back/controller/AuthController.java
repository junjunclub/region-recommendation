package region.back.controller;

import region.back.dto.SignUpRequest;
import region.back.dto.LoginRequest;
import region.back.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    public String signUp(@RequestBody SignUpRequest signUpRequest) {
        authService.registerUser(signUpRequest);
        return "User registered successfully";
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        authService.authenticateUser(loginRequest);
        return "User authenticated successfully";
    }
}