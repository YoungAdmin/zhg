package com.ovozz.zhg.controller;

import com.ovozz.zhg.common.ResponseResult;
import com.ovozz.zhg.entity.User;
import com.ovozz.zhg.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    @ApiOperation(value = "查询所有用户信息",notes = "查询所有用户信息",httpMethod = "GET",response = User.class)
    public ResponseResult findALl(){
        Iterable<User> users = userService.findAll();
        return ResponseResult.success(users);
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ApiOperation(value = "添加用户",notes = "添加用户",httpMethod = "POST",response = User.class)
    public ResponseResult save(@RequestBody User user){
        try {
            User userTemp = userService.save(user);
            return ResponseResult.success(userTemp);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return ResponseResult.failure(e.getMessage());
        }
    }
}
