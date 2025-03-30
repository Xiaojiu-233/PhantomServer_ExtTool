package xj.interfaces.web;

import xj.abstracts.connect.ConnectHandler;

/**
 * HTTP协议专用过滤器
 */
public interface HttpWebFilter extends WebFilter {

    default Class<? extends ConnectHandler> getBelongConnectHandler(){
        return null;
    }
}
