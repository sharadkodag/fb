package com.fb.module.login;

import com.fb.entity.User;
import com.fb.mvputil.BasePresenter;
import com.fb.mvputil.BaseView;
import com.fb.service.UserService;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@UIScope
@SpringComponent
public class FacebookPresenter extends BasePresenter<BaseView> {
    @Autowired
    UserService userService;
    public List<User> getUserList(){
        return userService.getUserList();
    }

    public void addUser(User user){
        userService.addUser(user);
    }

}
