import java.util.Random;
import java.util.Scanner;

public class test8shuangseqiu {
    public static void main(String[] args) {
        //生成中奖号码
        int[] arr = creatNumber();
        System.out.println("============================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("============================");
        //用户录入号码
        int[] inputArr = inputNumber();
        //判断中奖情况
        compare(arr,inputArr);

    }


    //生成中奖号码
    public static int[] creatNumber(){
        Random r = new Random();

        //创建数组
        int[] arr = new int[7];
        //生成红球号码
        for (int i = 0; i < 6;) {
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr,redNumber);
            if (!flag){
                arr[i] = redNumber;
                i++;
            }
        }
        //生成蓝球号码
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;
        return arr;
    }
    //判断一个数字是否存在
    public static boolean contains(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return true;
            }
        }
        return false;
    }
    //用户录入号码
    public static int[] inputNumber(){
        //创建数组
        int[] arr = new int[7];
        //红球
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i+1) + "个红球号码:");
            int inputRedNumber = sc.nextInt();
            if(inputRedNumber <= 33 && inputRedNumber >= 1){
                //判断是否重复
                boolean flag = contains(arr,inputRedNumber);
                if(!flag){
                    arr[i] = inputRedNumber;
                    i++;
                }else{
                    System.out.println("输入的红球号码重复");
                }
            }else{
                System.out.println("输入的红球号码超出范围");
            }
        }
        //蓝球
        while (true) {
            System.out.println("请输入蓝球号码:");
            int inputBlueNumber = sc.nextInt();
            if (inputBlueNumber <= 16 && inputBlueNumber >=1){
                arr[6] = inputBlueNumber;
                break;
            }else{
                System.out.println("输入的蓝球号码超出范围");
            }
        }
        return arr;
    }
    //判断中奖情况
    public static void compare(int[] arr,int[] inputArr){
        //定义变量记录红球蓝球中奖情况
        int redCount = 0;
        int blueCount = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int redNumber = arr[i];
            //判断数字是否在录入数组中出现过
            for (int i1 = 0; i1 < inputArr.length - 1; i1++) {
                if(redNumber == inputArr[i1]){
                    redCount++;
                    //System.out.println(redCount);
                    break;
                }
            }
        }
        //System.out.println(redCount);
        //蓝球
        if (arr[arr.length - 1] == inputArr[arr.length - 1]){
            blueCount++;
        }
        //System.out.println(blueCount);
        
        //判断中奖情况
        if (redCount == 6 && blueCount == 1){
            System.out.println("恭喜你中奖1000万");
        }else if (redCount == 6 && blueCount ==0) {
            System.out.println("恭喜你中奖500万");
        }else if (redCount == 5 && blueCount ==1) {
            System.out.println("恭喜你中奖3000元");
        }else if ((redCount == 5 && blueCount ==0) || (redCount == 4 && blueCount == 1)){
            System.out.println("恭喜你中奖200元");
        }else if ((redCount == 4 && blueCount ==0) || (redCount == 3 && blueCount == 1)){
            System.out.println("恭喜你中奖10元");
        } else if (redCount == 0 && blueCount == 0) {
            System.out.println("谢谢参与");
        }else{
            System.out.println("恭喜你中奖5元");
        }
    }
}
