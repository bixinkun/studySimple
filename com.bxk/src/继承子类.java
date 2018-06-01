/**
 * @Author：Bixinkun
 * @Descripition:
 * @Date:Created in 2018-05-30 11:43
 */
public class 继承子类 extends 继承父类 {
    @Override
    public String method1() {
        return "继承子类重写了方法1";
    }

    public void aaa() {
        System.out.println("子类自己的方法");
    }

    public static void main(String[] args) {
        继承父类 test2 = new 继承父类();
        System.out.println(test2.method1());
        System.out.println(test2.method2());
        System.out.println();
        继承父类 test = new 继承子类();
        System.out.println(test.method1());

    }

}
