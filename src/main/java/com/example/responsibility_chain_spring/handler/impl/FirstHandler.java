package com.example.responsibility_chain_spring.handler.impl;

import com.example.responsibility_chain_spring.handler.UrlHandler;
import org.springframework.stereotype.Component;

import java.util.List;

/*
　* @Description TODO
  * @methodName 
　* @param 
　* @return 
　* @exception  
　* @author chentao.ji
　* @date 2019/5/21 15:43
　*/
@Component
public class FirstHandler extends UrlHandler {

    @Override
    public String getHandlerType() {
        return "first";
    }

    @Override
    public String echo(List<String> urls) {
        return "first echo";
    }
}
