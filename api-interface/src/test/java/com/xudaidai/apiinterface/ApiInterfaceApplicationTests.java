package com.xudaidai.apiinterface;

import com.xudaidai.apiclientsdk.client.XuApiClient;
import com.xudaidai.apiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ApiInterfaceApplicationTests {

    @Resource
    private XuApiClient xuapiClient;

    @Test
    void contextLoads() {
        String result = xuapiClient.getNameByGet("xudaidai");
        User user = new User();
        user.setUsername("lixudaidai");
        String usernameByPost = xuapiClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

}
