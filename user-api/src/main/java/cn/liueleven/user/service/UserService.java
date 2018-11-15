package cn.liueleven.user.service;

import cn.liueleven.user.domain.User;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @description: 用户服务
 * @date: 2018-11-15 10:26
 * @author: 十一
 */
@Service
public interface UserService {

    boolean save(User user);

    Collection<User> findAll();
}
