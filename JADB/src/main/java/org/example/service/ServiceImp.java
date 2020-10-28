package org.example.service;

import org.example.repository.User;
import org.example.repository.UserRep;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

@Service
public class ServiceImp implements org.example.service.Service {
    @Autowired
    private UserRep rep;

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public Iterable<User> getAll() {
        return rep.findAll();
    }

    @Override
    public void save(User model)  {
    }

    @Override
    public User update(User model) {
//        User user = usersCollection.stream().filter(v->v.getId()==model.getId()).findAny().get();
//        if (!(user ==null)){
//            model.getEmail();
//            model.getId();
//            model.getName();
//            model.getPass();
//            usersCollection.remove(user);
//            usersCollection.add(model);
//            return model;
//        }
        return null;
    }
    public ServiceImp(){

    }
}
