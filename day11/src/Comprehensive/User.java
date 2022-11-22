package Comprehensive;

public class User {
    //属性：用户名、密码、身份证号码、手机号码
    private String name;
    private String password;
    private String idCardNumber;
    private String phoneNumber;

    public User() {
    }

    public User(String name, String password, String idCardNumber, String phoneNumber) {
        this.name = name;
        this.password = password;
        this.idCardNumber = idCardNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

