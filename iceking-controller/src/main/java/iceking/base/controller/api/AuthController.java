package iceking.base.controller.api;

import iceking.base.utils.jwt.JwtUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {
    @GetMapping("/getAccessToken")
    public String getAccessToken() {
        String token= JwtUtil.getToken();
        return token;
    }
}
