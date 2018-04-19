package test;

import java.util.HashMap;
import java.util.Map;

public class nitiy {
    /**
     * 写出一个缓存系统的伪代码*/
        private Map<String, Object> map = new HashMap<String, Object>();
        public static void main(String[] args) {
            // TODO Auto-generated method stub
        }
        public synchronized Object getData(String key){
            Object value = map.get(key);
            if (value == null){
                return "aaa";//实现QueryDB()
            }
            return value;

    }
}
