package com.teamstory.userstoryproj.service;

import com.teamstory.userstoryproj.entity.UserEntity;
import java.util.Optional;

public interface UserService {
    Optional<UserEntity> findByUsername(String username);
    UserEntity saveUser(UserEntity user);
}
