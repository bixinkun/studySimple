/**
 * @Author：Bixinkun
 * @Descripition:
 * @Date:Created in 2018-05-29 15:27
 */
public class 循环 {
    public static void main(String[] args) {
        /**
         * 第一个for循环
         */
        for (int i = 0; i < 15; i++) {

            System.out.println("此时的i值为" + i);

            for (int x = 0; x < 10; x++) {
                System.out.println("此时的x值为" + x);

                for (int y = 0; y < 5; y++) {
                    System.out.println("此时的y值为" + y);

                    if (y==3){
                        System.out.println("此时i,x,y的值依次为"+i+x+y);
                        System.out.println();
                        return;
                        /**
                         * 把return换成break 结果完全不一样。return跳出所有循环
                         */
                    }
                }


            }

        }


    }
}
