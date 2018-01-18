import com.sunshine.Sum
import spock.lang.Specification


/**
 * Created by wangtao on 2017/3/1.
 */
class SumTest extends Specification {

    def sum = new Sum();

    def "sum should return param1+param2"() {
        expect:
        sum.sum(a, b) == c
        where :
        a | b || c
        1 | 2 || 3
        0 | 1 || 1
        1 | 0 || 1
    }

    def "sum should return param1 * param2"() {
        expect:
        sum.muti(a, b) ==a

        where:
        a | b
        1 | 1
        0 | 1
        1 | 0
    }


}
