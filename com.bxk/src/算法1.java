/**
 * @Author：Bixinkun
 * @Descripition: 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 * @Date:Created in 2018-05-30 10:44
 */
public class 算法1 {
    public static void main(String[] args) {
        算法1 test = new 算法1();
        int maxNumber = test.getMaxNumber(8);
        System.out.println(maxNumber);


    }

    public int getMaxNumber(int n) {
        int MaxNumber;
        if (n == 1) {
            MaxNumber = 1;
        } else if (n == 2) {
            MaxNumber = 1;
        } else {
            System.out.println(getMaxNumber(n - 1));
            MaxNumber = getMaxNumber(n - 1) + getMaxNumber(n - 2);

        }
        return MaxNumber;
    }

}
