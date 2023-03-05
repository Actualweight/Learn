package 考试;

import java.text.SimpleDateFormat;
import java.util.*;

public class Teseriqi {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
        System.out.println(f.format(c.getTime()));

    }
}
