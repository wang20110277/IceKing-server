package iceking.base.utils.jwt;

import iceking.base.config.auth.TokenConfig;
import org.springframework.stereotype.Component;

@Component
public class JwtProxyUtil {
    private TokenConfig tokenConfig;

    public JwtProxyUtil(TokenConfig tokenConfig){
        JwtUtil.setTokenConfig(tokenConfig);
    }
}
