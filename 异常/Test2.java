package 异常;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test2 {
    public static void main(String[] args) {
        //什么时候使用try-catch?
        //1.运行时异常，格式检查，数据有效性
        //2.非运行时异常，在编译的时候，强制添加try-catch
        //文件的读取、数据库的链接、格式的转换
        String s = "2000-01-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d = sdf.parse(s);
            System.out.println(d);
        }catch (ParseException e){
            e.printStackTrace();
        }finally{
            //finally不一定写
            //不管是否捕获异常，finall一定辉执行
            //作用：回收资源，关闭对象
            System.out.println("我执行了吗？");
        }
    }
}
