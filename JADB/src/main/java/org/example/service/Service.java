package org.example.service;

import org.example.repository.User;

import java.io.FileNotFoundException;

public interface Service {
    User get(int id);

    Iterable<User> getAll();

    void save(User model) throws FileNotFoundException;

    User update(User model);
}

