package xj.abstracts.web;

import java.io.IOException;
import java.nio.channels.SocketChannel;

/**
 * TCP通讯消息响应数据包，提供数据包对象统一抽象类
 */
public abstract class Response {

    // 成员属性
    protected String lineBreak;// 换行符

    protected String unitSplitBreak;// 单元分隔符

    // 成员方法
    /**
     * 构造方法
     */
    public Response() {}

    /**
     * 将数据响应给socket输出流
     */
    public abstract void writeMessage(SocketChannel os) throws IOException;

    /**
     * 存储数据
     */
    public abstract void storeData(byte[] data);

}
