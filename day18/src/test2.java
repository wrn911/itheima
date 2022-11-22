public class test2 {
    public static void main(String[] args) {
        //自幂数

        //计数器
        int count = 0;
        //位数
        int n = 9;
        //开始
        int start = (int)(Math.pow(10,n - 1));
        //结束
        int end = 0;
        for (int i = 0; i < n; i++) {
            end = end * 10 + 9;
        }
        for (int i = start; i <= end; i++) {
            //加和
            double sum = 0;
            for (int i1 = 0; i1 < n; i1++) {
                //获取每一位的数字
                int ge = (int)(i / Math.pow(10, i1) % 10);
                //加和
                sum += Math.pow(ge, n);
            }

            //判断
            if (sum == i) {
                System.out.println(sum);
                count++;
            }
        }
        System.out.println(count);
    }
}
