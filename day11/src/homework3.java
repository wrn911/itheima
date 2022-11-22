import java.util.ArrayList;

public class homework3 {
    /*有如下员工信息：
    姓名：张三，工资：3000
    姓名：李四，工资：3500
    姓名：王五，工资：4000
    姓名：赵六，工资：4500
    姓名：田七，工资：5000
    先需要将所有的员工信息都存入ArrayList集合中，并完成如下操作：
            1、判断是否有姓名为“王五”的员工，如果有，改名为“王小五”
            2、判断是否有姓名为“赵六”的员工，如果有，将其删除
            3、给姓名为“田七”的员工，涨500工资*/
    public static void main(String[] args) {
        ArrayList<Staff> list = new ArrayList<>();

        Staff s1 = new Staff("张三",3000);
        Staff s2 = new Staff("李四",3500);
        Staff s3 = new Staff("王五",4000);
        Staff s4 = new Staff("赵六",4500);
        Staff s5 = new Staff("田七",5000);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        //判断是否有姓名为“王五”的员工，如果有，改名为“王小五”
        for (Staff s : list) {
            String name = s.getName();
            if (name.equals("王五")){
                s.setName("王小五");
            }
        }

        //判断是否有姓名为“赵六”的员工，如果有，将其删除
        for (Staff s : list){
            String name = s.getName();
            if (name.equals("赵六")){
                list.remove(s);
            }
        }

        //给姓名为“田七”的员工，涨500工资
        for (int i = 0; i < list.size(); i++) {
            Staff s = list.get(i);
            String name = s.getName();
            if (name.equals("田七")){
                int originalWages = s.getWages();
                s.setWages(originalWages + 500);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getName();
            int wages = list.get(i).getWages();

            System.out.print(name + ", " + wages);
            System.out.println();
        }
    }
}
