package com.happy.video.service;

import com.happy.video.pojo.User;

public interface UserService {
    //直接复制于自动生成的mapper接口中的方法
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
