package com.ycn.dubbo.common.service;

import com.ycn.dubbo.common.entity.TUser;

import java.util.List;

/**
 * @desc:
 * @author: ycn
 * @date: 2019/8/1 10:45
 */
public interface UserService {
    int saveUser(TUser user);

    List<TUser> getUserList();

    TUser getUser(long userId);
}
