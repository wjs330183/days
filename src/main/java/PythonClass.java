import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PythonClass {
    public static void main(String[] args) {
        String url = "http://www.jihaoba.com/dianhua/";
        String result = SendGet(url);
//            boolean matches = Pattern.matches("\\d{3,4}\\-\\d{8}$", result);
        System.out.println(result);


    }

    static String SendGet(String url)
    {
        // 定义一个字符串用来存储网页内容
        String result = "";
        // 定义一个缓冲字符输入流
        BufferedReader in = null;
        try
        {
            // 将string转成url对象
            URL realUrl = new URL(url);
            // 初始化一个链接到那个url的连接
            URLConnection connection = realUrl.openConnection();
            // 开始实际的连接
            connection.connect();
            // 初始化 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            // 用来临时存储抓取到的每一行的数据
            String line;
            Pattern p = Pattern.compile("\\d{3,4}-\\d{8}");// 为patttern实例化
            while ((line = in.readLine()) != null)
            {
                Matcher m = p.matcher(line);// 进行匹配
                while(m.find()){
                    System.out.println(m.group());
                }

            }
        } catch (Exception e)
        {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally来关闭输入流
        finally
        {
            try
            {
                if (in != null)
                {
                    in.close();
                }
            } catch (Exception e2)
            {
                e2.printStackTrace();
            }
        }
        return result;
    }
}
