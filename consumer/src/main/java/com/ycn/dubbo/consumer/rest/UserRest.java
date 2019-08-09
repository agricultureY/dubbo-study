package com.ycn.dubbo.consumer.rest;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ycn.dubbo.common.entity.TUser;
import com.ycn.dubbo.common.response.CommonResponse;
import com.ycn.dubbo.common.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.MediaType;

/**
 * @desc:
 * @author: ycn
 * @date: 2019/8/1 11:16
 */
@Api(description = "用户信息")
@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON)
public class UserRest {

//    @Autowired
    /** dubbo注解远程引用service服务 */
    @Reference
    private UserService userService;

    /**
     * @desc:
     * @author: ycn
     * @date: 2019/8/1 11:56
     */
    @ApiOperation(value = "查询所有用户的信息")
    @GetMapping(value = "/getUserList")
    public CommonResponse getUserList() {
        return CommonResponse.success(userService.getUserList());
    }

    /**
     * @desc:
     * @author: ycn
     * @date: 2019/8/1 11:56
     */
    @ApiOperation(value = "查询单个用户的信息")
    @RequestMapping(value = "/getUser/{userId}", method = RequestMethod.GET)
    public CommonResponse getUser(@PathVariable("userId") long userId) {
        return CommonResponse.success(userService.getUser(userId));
    }

    /**
     * @desc:
     * @author: ycn
     * @date: 2019/8/1 11:56
     */
    @ApiOperation(value = "添加一个用户")
    @RequestMapping(value = "/saveUser", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON)
    public CommonResponse saveUser(@RequestBody TUser user) {
        return CommonResponse.success(userService.saveUser(user));
    }
}
