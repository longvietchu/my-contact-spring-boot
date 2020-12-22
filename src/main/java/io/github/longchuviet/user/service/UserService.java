package io.github.longchuviet.user.service;

import io.github.longchuviet.user.entity.User;
import jdk.nashorn.internal.runtime.options.Option;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    void saveUser(User user);

    void deleteUser(Long id);

    Option<User> findUserById(Long id);
}
