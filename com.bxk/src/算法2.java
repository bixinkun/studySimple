/**
 * @Author：Bixinkun
 * @Descripition: 判断101-200之间有多少个素数，并输出所有素数。
 * @Date:Created in 2018-05-30 11:16
 */
public class 算法2 {
    public static void main(String[] args) {
        算法2 test = new 算法2();
        for (int i = 101; i < 200; i++) {
            System.out.println(test.isNumber(i));
        }
    }

    // 判断是否是素数
    public String isNumber(int number) {
        for (int i = 2; i < number / 2; i++) {
            int a = number % i;
            if (a == 0) {
                return number + "不是素数";
            }

        }
        return number + "是素数";
    }
}
