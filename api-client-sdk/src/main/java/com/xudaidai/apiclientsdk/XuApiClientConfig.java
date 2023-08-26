package com.xudaidai.apiclientsdk;

import cn.hutool.setting.yaml.YamlUtil;
import com.xudaidai.apiclientsdk.client.XuApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author xulongfei
 * @date 2023/8/25 14:10
 */
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
