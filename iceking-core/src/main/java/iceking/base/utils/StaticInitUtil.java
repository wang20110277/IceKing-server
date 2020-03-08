package iceking.base.utils;

import iceking.base.jwt.TokenSettings;
import org.springframework.stereotype.Component;

@Component
public class StaticInitUtil {
    private TokenSettings tokenSettings;

    public StaticInitUtil(TokenSettings tokenSettings){
        JavaWebTokenUtil.setTokenSettings(tokenSettings);
    }
}
