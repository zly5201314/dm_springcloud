package com.jk.controller;

import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <pre>项目名称：dm_springcloud
 * 类名称：UserController
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/15 19:07
 * 修改人：张利瑶
 * 修改时间：2019/4/15 19:07
 * 修改备注：
 * @version </pre>
 */
@Controller
public class UserController {

    @Autowired
    private UserService userservice;


    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return userservice.hiService( name );
    }


    @GetMapping(value = "/denglu")
    public String denglu() {

        return "denglu";
    }

    @GetMapping(value = "/zhuce")
    public String zhuce() {
        return "zhuce";
    }

    @GetMapping(value = "/shouye")
    public String shouye() {
        return "shouye";
    }

    @GetMapping(value = "/tofive")
    public String tofive() {
        return "tofive";
    }



}
