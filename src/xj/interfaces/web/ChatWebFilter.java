package xj.interfaces.web;

import xj.abstracts.connect.ConnectHandler;

/**
 * TCP聊天室协议专用过滤器
 */
public interface ChatWebFilter extends WebFilter {

    default Class<? extends ConnectHandler> getBelongConnectHandler(){
        return null;
    }
}
