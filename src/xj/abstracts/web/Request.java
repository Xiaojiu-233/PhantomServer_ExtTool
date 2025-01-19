package xj.abstracts.web;

// TCP通讯消息请求数据包，提供数据包对象统一抽象类
public abstract class Request {

    // 成员属性
    protected byte[] data;// 数据

    protected String lineBreak;// 换行符

    // 成员方法
    // 构造方法
    public Request(byte[] data) {
        this.data = data;
        lineBreak = null;
    }

    // 将数据编码为字符串数组
    public String[] encodeToString() {
        return new String(data).split(lineBreak);
    }

    // 判定数据是否为空
    public boolean isEmptyData() {
        return data.length == 0;
    }

    // 返回数据
    public byte[] getData() {
        return data;
    }
}
