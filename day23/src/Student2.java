public class Student2 implements Comparable<Student2>{
    private String name;
    private int age;
    private int chinese;
    private int math;
    private int english;

    public Student2() {
    }

    public Student2(String name, int age, int chinese, int math, int english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return chinese
     */
    public int getChinese() {
        return chinese;
    }

    /**
     * 设置
     * @param chinese
     */
    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
    }

    /**
     * 获取
     * @return english
     */
    public int getEnglish() {
        return english;
    }

    /**
     * 设置
     * @param english
     */
    public void setEnglish(int english) {
        this.english = english;
    }

    public String toString() {
        return "Student2{name = " + name + ", age = " + age + ", sum = " +(chinese + math + english) + ", chinese = " + chinese + ", math = " + math + ", english = " + english + "}";
    }

    @Override
    public int compareTo(Student2 o) {
        //计算总分
        int sum1 = this.getEnglish() + this.getChinese() + this.getMath();
        int sum2 =o.getEnglish() + o.getChinese() + o.getMath();

        //按总分排序
        int result = sum1 - sum2;
        //如果总分一样,则按语文成绩排序
        result = result == 0 ? this.getChinese() - o.getChinese() : result;
        //如果语文成绩一样,则按数学成绩排序
        result = result == 0 ? this.getMath() - o.getMath() : result;
        //如果数学成绩一样,则按英语成绩排序(可以省略不写,因为若总分,语文成绩,数学成绩均一样,则英语成绩必定一样)
        result = result == 0 ? this.getEnglish() - o.getEnglish() : result;
        //如果英语成绩一样,则按年龄排序
        result = result == 0 ? this.getAge() - o.getAge() : result;
        //如果年龄一样,则按姓名字母顺序排序
        result = result == 0 ? this.getName().compareTo(o.getName()) : result;
        return result;
    }
}
