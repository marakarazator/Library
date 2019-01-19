package com.koddokariery.library.user;

import com.koddokariery.library.user.web.CreateUserDto;
import com.koddokariery.library.user.web.UserResponse;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserMapper {

    public UserResponse map(User userEntity) {
        return new UserResponse(userEntity.getId(), userEntity.getFirstName(), userEntity.getLastName(), userEntity.getEmail());
    }


    public User createNew(CreateUserDto createUserDto) {
        User user = new User();
        user.setCreatedAt(new Date());
        user.setFirstName(createUserDto.getFirstName());
        user.setLastName(createUserDto.getLastName());
        user.setEmail(createUserDto.getEmail());
        user.setPassword(createUserDto.getPassword());
        user.setUserRole(createUserDto.getUserRole());

        return user;
    }
}
