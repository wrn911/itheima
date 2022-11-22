package homework;

public class StudentsTest {
    /*
定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
学生的属性：学号，姓名，年龄。
要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
要求2：添加完毕之后，遍历所有学生信息。
要求3：通过id删除学生信息
      如果存在，则删除，如果不存在，则提示删除失败。
要求4：删除完毕之后，遍历所有学生信息。
要求5：查询数组id为“2”的学生，如果存在，则将他的年龄+1岁*/

    public static void main(String[] args) {
        //创建数组
        Students[] arr = new Students[3];

        //创建学生对象
        Students s1 = new Students(1,"张三",23);
        Students s2 = new Students(2,"李四",24);
        //Students s3 = new Students(3,"王五",25);

        //将3个学生对象添加至数组
        arr[0] = s1;
        arr[1] = s2;
        //arr[2] = s3;

        //新建学生对象
        Students s4 = new Students(4,"赵六",26);

        //唯一性判断,原数组是否包含这个id,不使用方法会导致大量嵌套
        boolean flag = contains(arr, s4.getId());
        //创建新数组,长度比老数组大1
        Students[] newArr = creatArr(arr);
        if (flag){
            //1.包含 --- 不添加
            System.out.println("id重复,添加失败");
        }else{
            //2.不包含 --- 添加
            //添加新学生对象:原数组是否已满?
            int count = counts(arr);
            //System.out.println(count);
            if (count == arr.length){
                //1.已满 --- 创建新数组,长度比老数组大1
                //System.out.println(newArr.length);
                newArr[count] = s4;
            }else {
                //2.不满 --- 直接添加
                newArr[count] = s4;
            }
        }

        //遍历数组,可用方法实现,但不知道遍历新老数组
        bianli(newArr);
        System.out.println();

        //判断id是否存在,并返回当前id对应的学生的索引,以确定学生对象的位置
        int index = judge(newArr,1);
        //删除时可用null来替换原来对象
        if (index >= 0){
            //存在
            newArr[index] = null;
        }else{
            //不存在
            System.out.println("此id不存在,删除失败");
        }

        //遍历数组,可用方法实现,但不知道遍历新老数组
        bianli(newArr);
        System.out.println();

        //查询数组id为“2”的学生，如果存在，则将他的年龄+1岁
        int i = judge(newArr,2);
        if (i >= 0){
            Students s = newArr[i];
            int age = s.getAge();
            int newAge = age + 1;
            s.setAge(newAge);
        }else {
            System.out.println("此id不存在");
        }

        //遍历数组,可用方法实现,但不知道遍历新老数组
        bianli(newArr);

    }
    //唯一性判断,原数组是否包含这个id
    //1.包含 --- 不添加
    //2.不包含 --- 添加
    //要做什么
    //需要什么
    //是否需要返回值
    public static boolean contains(Students[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                int sid = arr[i].getId();
                if (sid == id){
                    return true;
                }
            }
        }
        //当循环结束后还没找到相同id,说明id在数组中不存在
        return false;
    }

    //要做什么   原数组有多少个元素?----多少个元素不是null
    //需要什么    原数组
    //是否需要返回值  是
    public static int counts(Students[] arr){
        //统计变量
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                count++;
            }
        }
        return count;
    }

    //创建新数组
    public static Students[] creatArr(Students[] arr){
        Students[] newArr = new Students[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //遍历数组
    public static void bianli(Students[] arr){
        for (int i = 0; i < arr.length; i++) {
            Students st = arr[i];
            if (arr[i] != null){
                System.out.println(st.getId() + " " + st.getAge() + " " + st.getName());
            }
        }
    }

    //判断id是否存在,并返回当前id对应的学生的索引,以确定学生对象的位置
    public static int judge(Students[] arr , int id){
        for (int i = 0; i < arr.length; i++) {
            Students st = arr[i];
            if(st != null){
                int sid = st.getId();
                if (sid == id){
                    return i;
                }
            }
        }
        //返回-1,表示不存在
        return -1;
    }




}
