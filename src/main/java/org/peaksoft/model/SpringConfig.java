package org.peaksoft.model;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.peaksoft.model")
@PropertySource("classpath:application.properties")
public class SpringConfig {
//    @Bean
//    public Car carBean() {
//        Car car = new Car();
//        car.setCarName("Bmw");
//        return car;
//    }
//
//    @Bean
//    public Pet petBean() {
//        Pet pet = new Pet();
//        pet.setName("Dog");
//        return pet;
//    }
//
//    @Bean
//    public User userBean() {
//        User user = new User();
//        user.setName("Nurjigit");
//        user.setAge(22);
//        user.setCar(carBean());
//        user.setPet(petBean());
//        return user;
//
//}
}
