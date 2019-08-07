package com.ycn.dubbo.provider.mapper;

import com.gitee.fastmybatis.core.mapper.CrudMapper;
import com.ycn.dubbo.common.entity.TUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @desc:
 * @author: ycn
 * @date: 2019/8/1 11:39
 */
@Mapper
public interface UserMapper extends CrudMapper<TUser, Long> {
}
