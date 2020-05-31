import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/**
 * Created by wangtao on 2016/11/10.
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.home"));
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list.contains(1));


    }
}
