package xj.interfaces.mvc;

/**
 * 通过multipart表单数据上传的文件对象接口
 */
public interface MultipartFile {

    /**
     * 获取数据名
     */
    public String getName();

    /**
     * 获取文件名
     */
    public String getFileName();

    /**
     * 获取ContentType
     */
    public String getContentType();

    /**
     * 获取文件数据
     */
    public byte[] getDataBytes();
}
