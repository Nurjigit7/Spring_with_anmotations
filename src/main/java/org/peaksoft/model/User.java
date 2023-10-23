package org.peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(scopeName = "prototype")
public class User {
    private String name;
    private int age;
    private Car car;
    private Pet pet;

    public User(){

    }
    @Autowired
    public User(Car car, @Qualifier("cat")
    Pet pet) {
        this.pet = pet;
        this.car = car;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Pet getPet() {
        return pet;
    }
    @PostConstruct
    public void init(){
        System.out.println("Class User : init method");
    }
    @PreDestroy
public void  destroy(){
    System.out.println("Class User : destroy method");
}
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                ",pet=" + pet +
                '}';
    }
}
