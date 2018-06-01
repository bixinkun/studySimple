/**
 * @Author：Bixinkun
 * @Descripition:
 * @Date:Created in 2018-05-30 14:39
 */
public class 继承子子类 extends  继承子类 {

    @Override
    public String method2() {
        return "aaa";
    }

    public static void main(String[] args) {
        继承父类 test = new 继承子子类();

        System.out.println(test.method2());
         System.out.println(test.method1());

    }
}
