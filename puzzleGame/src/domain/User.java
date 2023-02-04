package domain;

public class User {
    private String userName;
    private String password;
    private int count;

    public User() {
    }

    //创建新用户时默认count(连续输错次数为0)
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.count = 0;
    }

    public User(String userName, String password, int count) {
        this.userName = userName;
        this.password = password;
        this.count = count;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Username=" + userName + "&Password=" + password +"&count=" + count;
    }
}
