package cn.liueleven.user.web.service;

import cn.liueleven.user.domain.User;
import cn.liueleven.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @description: 一定要写注释啊
 * @date: 2018-11-15 11:01
 * @author: 十一
 */
@Service
public class UserServiceImpl implements UserService {



    @Override
    public boolean save(User user) {
        return false;
    }

    @Override
    public Collection<User> findAll() {
        return null;
    }
}
