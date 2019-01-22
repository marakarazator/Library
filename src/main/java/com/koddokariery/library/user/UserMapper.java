package com.koddokariery.library.user;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class UserMapper {

    public UserResponse map(User userEntity) {
        return new UserResponse(userEntity.getId(), userEntity.getFirstName(), userEntity.getLastName(), userEntity.getEmail());
    }


    public User createNew(CreateUserDto createUserDto) {
        User user = new User();
        user.setCreatedAt(LocalDateTime.now());
        user.setFirstName(createUserDto.getFirstName());
        user.setLastName(createUserDto.getLastName());
        user.setEmail(createUserDto.getEmail());
        user.setPassword(createUserDto.getPassword());
        user.setUserRole(createUserDto.getUserRole());

        return user;
    }


}
