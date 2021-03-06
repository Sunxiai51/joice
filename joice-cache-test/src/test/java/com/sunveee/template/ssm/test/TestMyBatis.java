package com.sunveee.template.ssm.test;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sunveee.template.ssm.model.User;
import com.sunveee.template.ssm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml", "classpath:spring-cache.xml" })
public class TestMyBatis {
    @Resource
    private UserService userService;

    @Test
    public void testGetUser() {
        User user = userService.getUserById(1);
        System.out.println(user.getName());
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        System.out.println(StringUtils.join(a, ','));
    }

}