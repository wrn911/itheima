public class Coder {
    private String name;
    private int id;
    private int salary;
    private int bonus;

    public Coder(){}

    public Coder(String name,int id,int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;

    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id ){
        this.id = id;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }


    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public int getSalary(){
        return salary;
    }

    public void work(){
        System.out.println("工号为" + id+ "基本工资为" + salary + "的程序员" + name + "正在努力的写着代码......");
    }
}
