package com.jdbc.jvt1.service;



import com.jdbc.jvt1.entity.Role;
import com.jdbc.jvt1.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();
}
