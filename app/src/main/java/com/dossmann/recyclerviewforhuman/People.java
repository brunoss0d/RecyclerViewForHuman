package com.dossmann.recyclerviewforhuman;

public class People {

    public enum Sex {
        MALE,
        FEMALE,
        NSPP
    }
    private int age;
    private String name;
    private Sex sex;
    private boolean loveAndroid;


    public People(int age, String name, Sex sex, boolean loveAndroid) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.loveAndroid = loveAndroid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public boolean isLoveAndroid() {
        return loveAndroid;
    }

    public void setLoveAndroid(boolean loveAndroid) {
        this.loveAndroid = loveAndroid;
    }

    public String getDescription(){
        return String.format("%s %s %d Love Android : %s",name,sex,age,loveAndroid);
    }
}
