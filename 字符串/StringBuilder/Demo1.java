package 字符串.StringBuilder;

public class Demo1 {
    public static void main(String[] args) {
		//初始化
		StringBuilder sb = new StringBuilder();
		//添加
		sb.append("aaa");
		System.out.println(sb);
		//反转
		sb.reverse();
		System.out.println("字符串的反转："+sb);
		//添加到任意位置
		sb.insert(2,"ccc");
		System.out.println("字符串的添加："+sb);
        //删除第一个字符
        sb.deleteCharAt(0);
        System.out.println("删除第一个字符："+sb);
        //删除某一段字符
        sb.delete(0, 2);
        System.out.println("删除两个字符："+sb);
    }
}
