package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void update(User user);
    void delete(User user);
    void delete(Long id);
    User findById(Long id);
    List<User> listUsers();
}
