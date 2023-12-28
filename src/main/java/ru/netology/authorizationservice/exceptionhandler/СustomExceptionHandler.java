package ru.netology.authorizationservice.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import ru.netology.authorizationservice.exception.InvalidCredentials;
import ru.netology.authorizationservice.exception.UnauthorizedUser;

@ControllerAdvice
public class СustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(InvalidCredentials.class)
    protected ResponseEntity<Object> handleInvalidCredentials(InvalidCredentials ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnauthorizedUser.class)
    protected ResponseEntity<Object> handleUnauthorizedUser(UnauthorizedUser ex){
        System.out.println("UnauthorizedUser: " + ex.getMessage());
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.UNAUTHORIZED);
    }
}
