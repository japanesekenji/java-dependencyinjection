package com.appserv.store;

public interface UserRepository {
    void save(User user);

    User findByEmail(String email);
}
