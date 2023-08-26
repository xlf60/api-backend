package com.xuapi.apiinterface;

import com.xudaidai.apiclientsdk.client.XuApiClient;
import com.xudaidai.apiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@SpringBootTest
class ApiInterfaceApplicationTests {

    @Resource
    private XuApiClient xuApiClient;

    @Test
    void contextLoads() {
        String result = xuApiClient.getNameByGet("xudaidai");
        System.out.println(result);
        User user = new User();
        user.setUsername("xlf");
        String usernameByPost = xuApiClient.getUsernameByPost(user);
        System.out.println(usernameByPost);
    }

}
