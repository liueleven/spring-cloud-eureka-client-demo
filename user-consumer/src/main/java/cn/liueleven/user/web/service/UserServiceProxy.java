package cn.liueleven.user.web.service;

import cn.liueleven.user.domain.User;
import cn.liueleven.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @description: 消费者通过一个代理来向提供者发送请求
 * @date: 2018-11-15 11:23
 * @author: 十一
 */
@Service
public class UserServiceProxy implements UserService{

    private static final String PROVIDER_SERVER_URL_PREFIX = "http://user-provider/";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public boolean save(User user) {
        User result  = restTemplate.postForObject(PROVIDER_SERVER_URL_PREFIX + "/user/save",user,User.class);
        return false;
    }

    @Override
    public Collection<User> findAll() {
        return null;
    }
}
