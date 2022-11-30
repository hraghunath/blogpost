package com.blog.services;

import com.blog.dto.RegistrationDto;
import com.blog.entities.User;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);

    User findByEmail(String email);

}
