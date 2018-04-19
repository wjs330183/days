package test;




import javax.activation.DataHandler;
import javax.activation.FileDataSource;

import javax.mail.Address;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.*;
import javax.activation.DataSource;
import java.io.*;
import java.util.Properties;

public class SendEmail1 {
    public static void main(String[] args) throws MessagingException, IOException {


        //环境
        Session session = Session.getDefaultInstance(new Properties());
        //邮件
        MimeMessage msg = new MimeMessage(session);
        //设置主题
        msg.setSubject("test123456");
        //发件人，注意中文的处理
        msg.setFrom(new InternetAddress("\"" + MimeUtility.encodeText("某某") + "\"<xxxxxx@163.com>"));
        //设置邮件回复人
        msg.setReplyTo(new Address[] {new InternetAddress("wjs330183@163.com")});

        //整封邮件的MINE消息体
        MimeMultipart msgMultipart = new MimeMultipart("mixed");//混合的组合关系
        //设置邮件的MINE消息体
        msg.setContent(msgMultipart);


        //附件1
        MimeBodyPart attch1 = new MimeBodyPart();
        //附件2
        MimeBodyPart attch2 = new MimeBodyPart();
        //正文内容
        MimeBodyPart content = new MimeBodyPart();
        //把内容，附件1，附件2健康I啊如到MINE消息体中
        msgMultipart.addBodyPart(attch1);
        msgMultipart.addBodyPart(attch2);
        msgMultipart.addBodyPart(content);
        //把文件，添加到付件1中
        //数据源
        DataSource ds1 = new FileDataSource(new File("D://1.txt"));
        //数据处理器
        DataHandler dh1 = new DataHandler(ds1);
        //设置第一个附件的数据
        attch1.setDataHandler(dh1);
        //设置第一个附件的文件名
        attch1.setFileName("file1.jpg");

        //把文件，添加到附件2中
        //数据源
        DataSource ds2 = new FileDataSource(new File("D://2.txt"));
        //数据处理器
        DataHandler dh2 = new DataHandler(ds2);
        //设置第一个附件的数据
        attch1.setDataHandler(dh2);
        //设置第一个附件的文件名
        attch1.setFileName("file2.jpg");

        //正文(图片和文字部分)
        MimeMultipart bodyMultipart = new MimeMultipart("related");
        //设置内容为正文
        content.setContent(bodyMultipart);

        //html代码部分
        MimeBodyPart htmlPart = new MimeBodyPart();
        //html中嵌套的图片部分
        MimeBodyPart imgPart = new MimeBodyPart();

        //正文添加图片和html代码
        bodyMultipart.addBodyPart(htmlPart);
        bodyMultipart.addBodyPart(imgPart);

        //把文件，添加到图片中
        DataSource imgds = new FileDataSource(new File("D://logo.png"));
        DataHandler imgdh = new DataHandler(imgds);
        imgPart.setDataHandler(imgdh);
        //说明html中的img标签的sr,应用的是此图片
        imgPart.setHeader("Content-Location", "http://sunteam.cc/logo.jsg");

        //html代码
        htmlPart.setContent("<span style='color:red'>中文呵呵</span><img src=\"http://sunteam.cc/logo.jsg\">","text/html;charset=utf-8");
        //生成文件邮件
        msg.saveChanges();
        //输出
        OutputStream os = new FileOutputStream("D://2.txt");
        msg.writeTo(os);
        os.close();

    }
}
