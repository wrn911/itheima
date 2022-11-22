public class Dog {
    private String color;
    private String bread;

    public Dog(){}

    public Dog(String color,String bread){
        this.color = color;
        this.bread = bread;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setBread(String bread){
        this.bread = bread;
    }

    public String getColor(){
        return color;
    }

    public String getBread(){
        return bread;
    }

    public void eat(){
        System.out.println(color + "的" + bread + "正在吃骨头.......");
    }

    public void lookHouse(){
        System.out.println(color + "的" + bread + "正在看家.......");
    }
}
