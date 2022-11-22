import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        //定义一个数组,储存分数
        int[] scores = scoreArr();
        //求最大值
        int max = getMax(scores);
        //求最小值
        int min = getMin(scores);
        //求总和
        int sum = getSum(scores);
        //平均分 == 总和 - 最大 - 最小 / 4
        int avg = (sum - max - min) / (scores.length - 2);
        System.out.println("该选手平均分是:" + avg);
    }
    //求总和
    public static int getSum(int[] scores){
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }
    //最大值
    public static int getMax(int[] scores){
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max){
                max = scores[i];
            }
        }
        return max;
    }
    //最小值
    public static int getMin(int[] scores){
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] <min){
                min = scores[i];
            }
        }
        return min;
    }
    //数组
    public static int[] scoreArr(){
        Scanner sc = new Scanner(System.in);
        int scores[] = new int[6];
        for (int i = 0; i < scores.length;) {
            System.out.println("请输入评委打分:");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100){
                scores[i] = score;
                i++;
            }else{
                System.out.println("输入的分数超出范围,请重新输入");
            }
        }
        return scores;
    }
}
