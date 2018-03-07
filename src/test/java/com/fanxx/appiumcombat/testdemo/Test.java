package com.fanxx.appiumcombat.testdemo;
class Animal {
    void eat() {
        System.out.println("父类方法：animal : eat");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("子类方法：dog : eat");
    }
    void eatTest() {
        this.eat();   // this 调用自己的方法
        super.eat();  // super 调用父类方法
    }
}

public class Test {
    public static void main(String[] args) {

        Animal a = new Animal();
        // 直接调用父类的方法eat（）
        a.eat();
        Dog d = new Dog();
        // 调用子类的方法eatTest（）－－>分别调用子类自己的eat（）和父类的eat（）
        d.eatTest();
    }
}