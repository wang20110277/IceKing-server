package iceking.base.utils.jwt;

import iceking.base.config.auth.TokenConfig;

public class JwtUtil {
    private static String secretKey;
    private static String issuer;

    public static void setTokenConfig(TokenConfig tokenConfig){
        secretKey= tokenConfig.getSecretKey();
        issuer= tokenConfig.getIssuer();
    }

    public static String getToken(){
        return secretKey+issuer;
    }
}
