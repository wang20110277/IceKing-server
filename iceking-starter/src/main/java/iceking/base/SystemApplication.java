package iceking.base;

import iceking.base.utils.JavaWebTokenUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "iceking.base")
public class SystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class,args);
        System.out.println(JavaWebTokenUtil.getToken());
    }
}
