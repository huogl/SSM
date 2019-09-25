package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

public interface UserDAO {
    //插入一行数据
    public void save(User user);

    //定义展示所有数据
    public List<User> selectAll();

    //定义DAO接口
    public void deletByID(Integer id);
}
