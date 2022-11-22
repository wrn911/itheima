public class Phone {
    //定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，有打电话call()和sendMessage()两个功能。
    //请定义出手机类，类中要有空参、有参构造方法，set/get方法。
    //定义测试类，在主方法中使用空参构造创建对象，使用set方法赋值。
    private String brand;
    private int price;
    private String color;

    public void call(){
        System.out.println("价格为" + price + "的" + color + brand + "手机在打电话哦");
    }

    public void sendMessage(){
        System.out.println("价格为" + price + "的" + color + brand +"手机在发短信哦");
    }

    public String getBrand(){
        return brand;
    }

    public int getPrice(){
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Phone(){};

    public Phone(String brand,int price,String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
}
