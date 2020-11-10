package client.controller;

import client.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@RestController
@Transactional
public class Controller {
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;
    @RequestMapping("hello")
    public String hello(){
        User user = new User();
        user.setEmail("test");
        user.setPassword("13341");
        user.setUsername("name1");
        sessionFactory.getCurrentSession().save(user);
        return user.toString();

//        return "helloA-->Client";
    }
}
