package ru.netology.authorizationservice;

public class UnauthorizedUser extends RuntimeException{
    public UnauthorizedUser(String msg) {
        super(msg);
    }
}
