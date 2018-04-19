package test;

import com.sun.mail.util.MailSSLSocketFactory;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import javax.sql.DataSource;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Properties;

public class SendEmail {
    private static Transport transport;
    public static void main(String[] args) throws GeneralSecurityException {
        String to = "wjs330183@163.com";
        String from = "1197273479@qq.com";
        String host = "smtp.qq.com";
        //文件存放路径
        String filePath = "D:\\1.txt";
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        properties.put("mail.smtp.auth", "true");
        MailSSLSocketFactory sf = new MailSSLSocketFactory();
        sf.setTrustAllHosts(true);
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.ssl.socketFactory", sf);
        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("1197273479@qq.com", "otmbttuborhxbafj");
            }
        });
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("hello word");
//            message.setText("hello word");
            //向multipart对象中添加邮件的各个部分内容，包括文本内容和附件
            Multipart multipart = new MimeMultipart();
            //添加邮件正文
            BodyPart contentBoyPart = new MimeBodyPart();
            //邮件内容
            String result = "附件";
            contentBoyPart.setContent(result, "text/html;charset=UTF-8");
            multipart.addBodyPart(contentBoyPart);
            if (filePath != null && !"".equals(filePath)) {
                BodyPart attchmentBoyPart = new MimeBodyPart();
                //根据附件路径获取文件
                 FileDataSource dataSource = new FileDataSource(filePath);
                attchmentBoyPart.setDataHandler(new DataHandler(dataSource));
                //MimeUtility.encodeWord可以避免文件名乱码
                attchmentBoyPart.setFileName(MimeUtility.encodeWord(dataSource.getFile().getName()));
                multipart.addBodyPart(attchmentBoyPart);
            }
//            transport = session.getTransport("smtp");
            //邮件的文本内容
            message.setContent(multipart);
            transport.send(message);
            System.out.println("send...");
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


    }

//    private static void sendfj(Message message) throws MessagingException {
//        BodyPart bodyPart = new MimeBodyPart();
//        bodyPart.setText("nice");
//        BodyPart bodyPart1 = new MimeBodyPart();
//        DataSource source = (DataSource) new FileDataSource(new File("D:\\1.txt"));
//        bodyPart1.setDataHandler(new DataHandler((javax.activation.DataSource) source));
//        bodyPart1.setFileName("D:\\1.txt");
//        Multipart multipart = new MimeMultipart();
//        multipart.addBodyPart(bodyPart);
//        multipart.addBodyPart(bodyPart1);
//        message.setContent(multipart);
//        Transport.send(message);
//    }

}
