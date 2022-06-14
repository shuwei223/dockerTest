package org.javabody.formlogin.service;

import org.javabody.formlogin.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService implements UserDetailsService {
//    @Autowired
//    UserDao userDao;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = null;//userDao.findByUsername(username);
        Optional.ofNullable(user).orElseThrow(()->new UsernameNotFoundException("用户不存在"));
        return user;
    }
}
