package ru.netology.authorizationservice;

import java.util.Arrays;
import java.util.List;

public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        return Arrays.asList(Authorities.READ, Authorities.WRITE);
    }
}
