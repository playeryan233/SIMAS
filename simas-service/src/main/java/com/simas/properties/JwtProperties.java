package com.simas.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "simas.jwt")
@Data
public class JwtProperties {
    private String SECRET_KEY;
    private long EXPIRATION_TIME;
    private long REFRESH_EXPIRATION_TIME;
}
