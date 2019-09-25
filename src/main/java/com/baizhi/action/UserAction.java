package com.baizhi.action;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class UserAction extends ActionSupport {
    //定义Service接口做注入
    private UserService userService;
    //给前台传入所有的数据
    private List<User> users;
    //接收数据
    private User user;
    //接收ID
    private  Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String register() {
        //调用业务
        userService.modifyregister(user);
        return "index";
    }


    public String showAll() {
        //调用业务
        users = userService.showAll();
        return "showAll";
    }

    public  String  deleteByID(){
        //调用业务
        userService.modifydelete(id);
        return  "showAll";
    }

}
