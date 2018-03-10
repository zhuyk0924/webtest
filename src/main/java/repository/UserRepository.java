package repository;

import domain.User;

import java.util.List;

public interface UserRepository {

    List<User> findAll();
    int save(User user);
}
