package com.xudaidai.apiclientsdk;

import com.xudaidai.apiclientsdk.client.XuApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("xuapi.client")
@Data
@ComponentScan
public class XuApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public XuApiClient xuApiClient() {
        return new XuApiClient(accessKey, secretKey);
    }

}
