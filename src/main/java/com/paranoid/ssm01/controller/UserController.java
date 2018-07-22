package com.paranoid.ssm01.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.paranoid.ssm01.dao.UserMapper;
import com.paranoid.ssm01.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Paranoid
 * @create 2018-07-${DAT} 21:47
 */
@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "cs")
    public User cs(){
        User user = userMapper.selectUserByName("aaa");
        return user;

    }

}
