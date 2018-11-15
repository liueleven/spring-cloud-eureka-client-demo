package cn.liueleven.user.web.controller;

import cn.liueleven.user.domain.User;
import cn.liueleven.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @description: 一定要写注释啊
 * @date: 2018-11-15 10:30
 * @author: 十一
 */
@RestController
public class UserProviderController {

    @Autowired
    private UserService userService;

    /**
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/user/save",method = RequestMethod.POST)
    public User saveUser(@RequestParam String name) {
        User user = new User();
        user.setName(name);
        if(userService.save(user)) {
            return user;
        }else {
            return null;
        }
    }

    @GetMapping("/user/list")
    public Collection<User> list() {
         return userService.findAll();
    }
}
