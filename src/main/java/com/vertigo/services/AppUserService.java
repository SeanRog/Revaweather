package com.vertigo.services;


import com.vertigo.entities.AppUser;
import com.vertigo.repositories.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppUserService {

    @Autowired
    private AppUserRepository appUserRepository;

    @Transactional
    public List<AppUser> findAll() {
        Iterable<AppUser> usersIterable = appUserRepository.findAll();
        List<AppUser> usersList = new ArrayList<>();
        usersIterable.forEach((user) -> usersList.add(user));

        return usersList;
    }

}
