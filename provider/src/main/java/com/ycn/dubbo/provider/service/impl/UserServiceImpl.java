package com.ycn.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gitee.fastmybatis.core.query.Query;
import com.ycn.dubbo.common.entity.TUser;
import com.ycn.dubbo.common.service.UserService;
import com.ycn.dubbo.provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @desc:
 * @author: ycn
 * @date: 2019/8/1 11:39
 */
@Service    //dubbo @service暴露服务
@Component
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int saveUser(TUser user) {
        return userMapper.save(user);
    }

    @Override
    public List<TUser> getUserList() {
        return userMapper.list(new Query());
    }

    @Override
    public TUser getUser(long userId) {
        return userMapper.getById(userId);
    }
}
