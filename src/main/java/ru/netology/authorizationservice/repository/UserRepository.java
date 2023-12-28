package ru.netology.authorizationservice.repository;

import ru.netology.authorizationservice.Authorities;

import java.util.Arrays;
import java.util.List;

public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        return Arrays.asList(Authorities.READ, Authorities.WRITE);
    }
}
