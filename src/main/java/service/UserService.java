package service;


import domain.User;

import java.util.List;

public interface UserService {

    List<User> list();
    User add(User user);
}
