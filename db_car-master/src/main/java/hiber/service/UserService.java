package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    void addUserInfo(User user);

    List<User> getListUsers();

    User getUserByCar(String model, int series);
}