import com.sun.deploy.ref.AppModel;
import com.sun.deploy.ref.Helpers;

import javax.lang.model.element.VariableElement;

/**
 * @Author：Bixinkun
 * @Descripition:
 * @Date:Created in 2018-05-29 10:15
 */
public class 封装 {
    Long a;
    String b;

    public Long getA() {
        return a;
    }
    public Long getA1() {
        return a;
    }
    public Long getA2() {
        return a;
    }


    public void setA(Long a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "封装{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Integer ac;
        ac = 1;
        封装 test = new 封装();
        test.setB("haha");

        System.out.println();
        System.out.println(test.getA1() + "" + ac);

    }

}
