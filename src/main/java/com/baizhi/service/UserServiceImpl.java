package com.baizhi.service;

import com.baizhi.dao.UserDAO;
import com.baizhi.entity.User;

import java.util.List;

//原始类
public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void modifyregister(User user) {
        userDAO.save(user);
    }

    @Override
    public List<User> showAll() {
        List<User> users = userDAO.selectAll();
        return users;
    }

    @Override
    public void modifydelete(Integer id) {
        userDAO.deletByID(id);
    }

}
