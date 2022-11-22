public class Cat {
    private String color;
    private String bread;

    public Cat(){}

    public Cat(String color,String bread){
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
        System.out.println(color + "的" + bread + "正在吃鱼.......");
    }

    public void catchMouse(){
        System.out.println(color + "的" + bread + "正在抓老鼠.......");
    }
}
