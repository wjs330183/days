package Io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInput {
    public static void main(String[] args) throws IOException {
        //1. 找到目标文件
        File file = new File("/Users/a/workspace/a.txt");
//        /Users/a/workspace/a.txt
        //建立数据的输入通道。
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(new File("/Users/a/workspace/b.txt"));
        byte[] temp = new byte[1024];
        //读取文件中的数据
        int content = fileInputStream.read();
        while (content != -1) {
            fileOutputStream.write(temp, 0, temp.length);
            fileOutputStream.flush();
            content = fileInputStream.read(temp);
            System.out.println(temp.toString());
            System.out.println(content);
        }
//        System.out.println(content);
//        // read() 读取一个字节的数据，把读取的数据返回。
//        System.out.println("读到的内容是："+ (char)content);
        //关闭资源    实际上就是释放资源。
        fileInputStream.close();
        fileOutputStream.close();
    }
}
