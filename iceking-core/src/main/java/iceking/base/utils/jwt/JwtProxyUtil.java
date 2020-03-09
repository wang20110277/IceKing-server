package iceking.base.utils.jwt;

import iceking.base.config.auth.TokenConfig;
import org.springframework.stereotype.Component;

@Component
public class JwtProxyUtil {
    public JwtProxyUtil(TokenConfig tokenConfig){
        JwtUtil.setTokenConfig(tokenConfig);
    }
}
