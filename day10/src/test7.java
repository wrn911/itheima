public class test7 {
    public static void main(String[] args) {
        //敏感词替换
        String talk = "这游戏真好玩,TMD,CNM,MLGB";

        //敏感词库
        String[] arr = {"TMD","MLGB","CNM","SB"};

        //String result = "";
        //循环替换
        for (int i = 0; i < arr.length; i++) {

            talk = talk.replace(arr[i], "***");
        }

        System.out.println(talk);
    }
}
