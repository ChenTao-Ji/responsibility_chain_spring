package com.example.responsibility_chain_spring.serivce.impl;

import com.example.responsibility_chain_spring.handler.impl.FirstHandler;
import com.example.responsibility_chain_spring.handler.impl.SecondHandler;
import com.example.responsibility_chain_spring.handler.impl.ThirdHandler;
import com.example.responsibility_chain_spring.serivce.UrlService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*
　* @Description TODO
  * @methodName
　* @param 
　* @return 
　* @exception  
　* @author chentao.ji
　* @date 2019/5/21 15:42
　*/
@Service
public class UrlServiceImpl implements UrlService, InitializingBean {

    @Autowired
    private FirstHandler firstHandler;

    @Autowired
    private SecondHandler secondHandler;

    @Autowired
    private ThirdHandler thirdHandler;

    @Override
    public String invoke(String source) {
        List<String> list = new ArrayList();
        return firstHandler.handleMessage(source, list);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        firstHandler.setNext(secondHandler);
        secondHandler.setNext(thirdHandler);
    }
}
