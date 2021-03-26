package com.seven.cloud.controller;

import com.seven.cloud.entity.CommonResult;
import com.seven.cloud.entity.User;
import com.seven.cloud.service.UserService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yinbenyang
 * @version 1.0
 * @description: TODO
 * @date 2021/3/25 8:15 下午
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("save")
    public CommonResult save(@RequestBody User user){
        return CommonResult.builder().code(200).msg("插入成功").data(userService.add(user)).build();
    }

    @GetMapping("get")
    public CommonResult get(@RequestParam int id){
        return CommonResult.builder().code(200).msg("查询成功").data(userService.getUserById(id)).build();
    }

}
