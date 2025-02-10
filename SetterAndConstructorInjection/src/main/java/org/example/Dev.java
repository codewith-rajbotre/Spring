package org.example;

public class Dev {
    private Laptop laptop;
    private int age ;

//
//    public Dev(int age) {
//        System.out.println("This is Dev Constructor");
//        this.age = age;
//    }


    public Dev(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("In Laptop Constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dev(){
        System.out.println("Dev Constructor");
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build(){

        System.out.println("Building Dev");
        laptop.run();
    }
}
