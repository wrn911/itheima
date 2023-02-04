package myDynamicProxy;

public class BigStar implements Star{
    private String name;


    public BigStar() {
    }

    public BigStar(String name) {
        this.name = name;
    }

    //唱歌
    @Override
    public String sing(String singName){
        System.out.println(name + "正在唱" + singName);
        return "你干嘛~~";
    }

    //跳舞
    @Override
    public void dance(){
        System.out.println(name + "正在跳舞");
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

    public String toString() {
        return "BaiStar{name = " + name + "}";
    }
}
