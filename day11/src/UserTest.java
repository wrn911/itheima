import java.util.ArrayList;

public class UserTest {
    public static void main(String[] args) {
        //定义集合
        ArrayList<User> list = new ArrayList<>();

        //创建对象
        User u1 = new User("heima001","张三","12344321");
        User u2 = new User("heima002","李四","12345678");
        User u3 = new User("heima003","王五","1234qwer");

        //加入列表
        list.add(u1);
        list.add(u2);
        list.add(u3);

        String uid = "heima003";
        boolean flag = contains(list,uid);

        int index = getIndex(list,uid);

        System.out.println(flag);
        System.out.println(index);
    }

    //定义方法,根据id查找用户,并返回索引
    public static int getIndex(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            //System.out.println(uid);
            if (uid.equals(id)){
                return i;
            }
        }
        //都没匹配上,返回-1
        return -1;
    }

    //定义方法,根据id查找用户,返回是否存在
    public static boolean contains(ArrayList<User> list,String id){
        /*for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                return true;
            }
        }
        return false;*/
        return getIndex(list,id) >= 0;
    }
}
