package com.company;

public class Username {
    public String username;
    public String fullname;
    public String email;
    public int age;
    public String password;

    public Username(String username, String fullname, String email, int age, String password) {
        this.username = username;
        this.fullname = fullname;
        this.email = email;
        this.age = age;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void changePassword(String newpassword){
        setPassword(newpassword);
    }

    public void printFullName(){
        System.out.println(getFullname());
    }

}
