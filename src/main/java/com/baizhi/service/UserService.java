package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

public interface UserService {
    //注册
    public void modifyregister(User user);

    //展示所有
    public List<User> showAll();

    //通过ID删除
    public void modifydelete(Integer id);
}
