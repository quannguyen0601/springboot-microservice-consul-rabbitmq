package com.citynow.revollet.revollet_auth_service.service;

import com.citynow.revollet.revollet_auth_service.dto.UserDto;
import com.citynow.revollet.revollet_auth_service.dto.mapper.UserMapper;
import com.citynow.revollet.revollet_auth_service.model.User;
import com.citynow.revollet.revollet_auth_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {


    private final UserRepository userRepository;

    private final UserMapper userMapper;

    @Autowired
    public UserService(UserRepository userRepository,UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    @Override
    public UserDetails loadUserByUsername(String username)  {

        Optional<User> user = userRepository.findByUsername(username);

        if(!user.isPresent())
            throw new UsernameNotFoundException(username + "can not find in the system.");

        return user.get();
    }

    public List<UserDto> getAllUser(){
        return userMapper.usersToUserDtos(userRepository.findAll());
    }
}
