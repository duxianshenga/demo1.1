package com.example.springboot.controller;

import com.example.springboot.entity.User;
import com.example.springboot.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户控制器
 * <p>
 *
 * @Date 2019/5/17 15:49
 **/
@Controller
//@RestController   @ResponseBody+@Controller的结合体 直接返回JSON数据
@RequestMapping("/user")
@EnableAutoConfiguration//开启自动配置
@Mapper()
public class UserController {

    /**
     *也可使用@Resource注解 @Resource属于J2EE   @Autowired则属于Spring
     *<p>
     */
    @Autowired
    private UserService userService;

    /**
     *查询User
     *<p>
      * @param
     *@return java.util.List<com.example.springboot.entity.User>
     *@date 2019/5/17
     */
    @ResponseBody
    @RequestMapping("/selectByUser")
    public List<User> selectByUser(){
        User user = new User();
        return userService.selectByUser(user);
    }
}
