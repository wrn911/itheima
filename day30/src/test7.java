import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class test7 {
    public static void main(String[] args) throws IOException {
        /**
         * 带权重的随机点名
         */
        //读取学生信息,封装成对象
        ArrayList<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("D:\\Java\\IdeaProjects\\itheima\\day30\\src\\a.txt"));
        String line;
        while ((line = br.readLine()) != null){
            String[] arr = line.split("-");
            Student stu = new Student(arr[0],arr[1],Integer.parseInt(arr[2]),Double.parseDouble(arr[3]));
            list.add(stu);
        }
        br.close();

        //计算总权重
        double weight = 0;
        for (Student stu : list) {
            weight += stu.getWeight();
        }

        //计算每个人的权重
        double[] arr = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i).getWeight() / weight;
        }

        //计算每个人的权重占比
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i -1];
        }

        //生成一个0 ~ 1之间的随机数
        double random = Math.random();

        //二分查找:
        //方法会返回: - 插入点 - 1
        //插入点 = - 结果 - 1
        int result = -Arrays.binarySearch(arr, random) - 1;

        //返回对应的学生
        Student stu = list.get(result);
        System.out.println(stu);

        //权重减半
        double w = stu.getWeight() / 2;
        stu.setWeight(w);

        //重新将数据写回文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Java\\IdeaProjects\\itheima\\day30\\src\\a.txt"));
        for (Student s : list) {
            bw.write(s.toString());
            bw.newLine();
        }
        bw.close();
    }
}
