package org.peaksoft;

import org.peaksoft.model.SpringConfig;
import org.peaksoft.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
//        Singleton singleton=Singleton.getInstance();
//        System.out.println(singleton.hashCode());
//
//        Singleton singleton1=Singleton.getInstance();
//        System.out.println(singleton1.hashCode());
//
//        Singleton singleton2=Singleton.getInstance();
//        System.out.println(singleton2.hashCode());
//
//        User user=new User();
//        User user1=new User();
//
//        System.out.println(user.hashCode());
//        System.out.println(user1.hashCode());
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);


        User user = context.getBean(User.class);
        user.setName("Aidai");
        user.setAge(18);
        System.out.println(user);
        User user1 = context.getBean(User.class);


//       User user2=context.getBean("userBean", User.class);
//        System.out.println(user2);
    }
}
