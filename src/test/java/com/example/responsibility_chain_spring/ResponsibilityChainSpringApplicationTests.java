package com.example.responsibility_chain_spring;

import com.example.responsibility_chain_spring.serivce.UrlService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ResponsibilityChainSpringApplicationTests {

    @Autowired
    private UrlService urlService;

    @Test
    public void contextLoads() {
        String source = "third";
        String invoke = urlService.invoke(source);
        System.out.println(invoke);
    }
}
