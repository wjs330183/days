package encryption;

import org.apache.commons.codec.binary.Hex;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha256 {


    /***
     *  利用Apache的工具类实现SHA-256加密
     * @param str 加密后的报文
     * @return
     */
    public static String getSHA256Str(String str) {
        //为应用提供信息摘要算法的功能。
        //信息摘要是安全的单向哈希函数，它接收任意大小的数据，并输出固定长度的哈希值。
        MessageDigest messageDigest;
        String encdeStr = "";
        try {
            //MessageDigest 对象开始被初始化。该对象通过使用update()方法处理数据。
            //任何时候都可以调用reset()方法重置摘要。一旦所有需要更新的数据都已经被更新了，
            // 应该调用digest()方法之一完成哈希计算。
            /**************************************************************/
            // 对于给定数量的更新数据，digest 方法只能被调用一次。在调用 digest 之后，
            // MessageDigest 对象被重新设置成其初始状态。
            messageDigest = MessageDigest.getInstance("SHA-256");//传入请求算法名称
            //messageDigest = MessageDigest.getInstance("SHA-256"，“wangjs”);//传入请求算法名称，提供者名称
            //通过执行诸如填充之类的最终操作完成哈希计算。在调用此方法之后，摘要被重置。
            byte[] hash = messageDigest.digest(str.getBytes("UTF-8"));
            encdeStr = Hex.encodeHexString(hash);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return encdeStr;
    }
    /**
     * 注意：Provider可以通过 java.security.Security.getProviders() 方法获取已注册提供者列表。
     * 比较常用的有“SUN
     *
     * SUN提供的常用的算法名称有：MD2
     * MD5
     * SHA-1
     * SHA-256
     * SHA-384
     * SHA-512
     */
    public static void main(String[] args) {
        String sha256Str = getSHA256Str("123456");
        System.out.println(sha256Str);
    }
}
