package com.koddokariery.library.user;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    public List<UserResponse> getAll(){
        return userRepository.findAll().stream().map(userMapper::map).collect(Collectors.toList());
    }

    @Transactional
    public void addUser(CreateUserDto createUserDto) {
        User user = userMapper.createNew(createUserDto);
        userRepository.save(user);
    }

    public UserResponse findOne(long id) {
        User user = userRepository.findById(id);
        return userMapper.map(user);
    }

}
