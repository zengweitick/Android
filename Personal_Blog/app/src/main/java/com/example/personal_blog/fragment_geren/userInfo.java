package com.example.personal_blog.fragment_geren;

public class userInfo {
    private int id;
    private String username;
    private String paswd;
    private String sex;
    private int age;
    private String intro;

    public userInfo(int id,String username, String paswd, String sex, int age,String intro) {
        this.id=id;
        this.username = username;
        this.paswd = paswd;
        this.sex = sex;
        this.age = age;
        this.intro=intro;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPaswd(String paswd) {
        this.paswd = paswd;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPaswd() {
        return paswd;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getIntro() {
        return intro;
    }
    public void setIntro(String intro)
    {
        this.intro=intro;
    }

    @Override
    public String toString() {
        return "userInfo{" + "id=" + id + ", username='" + username + '\'' +
                ", paswd='" + paswd + '\'' + ", sex='" + sex + '\'' +
                ", age=" + age + ", intro=" + intro+ '}';
    }
}
