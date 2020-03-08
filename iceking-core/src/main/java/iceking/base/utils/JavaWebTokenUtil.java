package iceking.base.utils;

import iceking.base.jwt.TokenSettings;

public class JavaWebTokenUtil {
    private static String secretKey;
    private static String issuer;

    public static void setTokenSettings(TokenSettings tokenSettings){
        secretKey=tokenSettings.getSecretKey();
        issuer=tokenSettings.getIssuer();
    }

    public static String getToken(){
        return secretKey+issuer;
    }
}
