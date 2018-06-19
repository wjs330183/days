import com.alibaba.fastjson.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Count {
    public static void main(String[] args) {
//        String name = "t_asd";
//        System.out.println(name.indexOf("_"));
//        String substring = name.substring(name.indexOf("_") + 1, name.length());
//        System.out.println(substring);
        List list = new ArrayList();
        list.add("1233213");
        list.add("1233213");
        list.add("1233213");
        list.add("1233213");
        System.out.println(JSONObject.toJSON(list));
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(System.currentTimeMillis());
        System.out.println(dateString);
    }
}
