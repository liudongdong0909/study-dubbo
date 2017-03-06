package com.donggua.dubbo.service;

import com.donggua.dubbo.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author IT_donggua
 * @version V1.0
 * @create 2017-03-06 下午 12:27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:dubbo/dubbo-consumer.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void queryAll() throws Exception {
        List<User> users = userService.queryAll();
        System.out.println("donggua77");
        for (User user : users) {
            System.out.println(user);
        }

    }

}