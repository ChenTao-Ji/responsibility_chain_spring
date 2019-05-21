package com.example.responsibility_chain_spring.handler;

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
public abstract class UrlHandler {

    private UrlHandler nextUrlHandler;

    public final String handleMessage(String source, List<String> urls) {
        String result = null;
        if (this.getHandlerType().equals(source)) {
            result = this.echo(urls);
        } else {
            if (this.getHandlerType() != null) {
                result = this.nextUrlHandler.handleMessage(source, urls);
            } else {
                throw new RuntimeException("");
            }
        }

        return result;
    }

    public void setNext(UrlHandler nextUrlHandler) {
        this.nextUrlHandler = nextUrlHandler;
    }

    public abstract String getHandlerType();

    public abstract String echo(List<String> urls);

}

