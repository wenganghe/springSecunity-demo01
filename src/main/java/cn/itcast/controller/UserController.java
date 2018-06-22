package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/****
 *@author :heima
 *@date :2018/6/6 0006 12:41 2018
 *@description :cn.itcast.controller
 ****/
@Controller
@RequestMapping(value = "/admin/user")
public class UserController {

    @RequestMapping(value = "/list")
    public String list(){
        return "user_list";
    }
}
