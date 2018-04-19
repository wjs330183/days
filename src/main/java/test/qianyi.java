package test;

import java.sql.*;

public class qianyi {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://115.28.115.222:3306/assetaccount4?useUnicode=true&characterEncoding=utf8&allowMultiQueries=true";
    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "cms";
    static final String PASS = "Cms123";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            // 注册 JDBC 驱动
            Class.forName("com.mysql.jdbc.Driver");

            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            // 执行查询
            System.out.println(" 实例化Statement对...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT rated_power,rated_power_factor,rated_voltage,rated_capacity,rated_speed,rated_current,generator_code FROM t_generator";
            ResultSet rs = stmt.executeQuery(sql);

            // 展开结果集数据库
            while(rs.next()){
                // 通过字段检索
                String rated_power = rs.getString("rated_power");
                String rated_power_factor = rs.getString("rated_power_factor");
                String rated_voltage = rs.getString("rated_voltage");
                String rated_capacity = rs.getString("rated_capacity");
                String rated_speed = rs.getString("rated_speed");
                String rated_current = rs.getString("rated_current");
                String generator_code = rs.getString("generator_code");

                // 输出数据
                System.out.print("rated_power: " + rated_power);
                System.out.print(", rated_power_factor: " + rated_power_factor);
                System.out.print(", rated_voltage : " + rated_voltage);
                System.out.print(", rated_capacity : " + rated_capacity);
                System.out.print(", rated_speed : " + rated_speed);
                System.out.print(", rated_current : " + rated_current);
                System.out.print(", generator_code : " + generator_code);
                System.out.print("\n");
            }
            // 完成后关闭
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");

    }
}
