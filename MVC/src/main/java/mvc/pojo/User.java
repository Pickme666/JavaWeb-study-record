package mvc.pojo;

/**
 * 用户登录案例
 * javaBean
 */

public class User {

    private int id;
    private String name;
    private String password;
    private String phone = "";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User { " +
                "id: " + id +
                "\tname: " + name +
                "\tpassword: " + password +
                "\tphone: " + phone +
                " }";
    }
}
