package com.midt.java;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class TeachersNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(com.midt.java.TeachersNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String notFound(com.midt.java.TeachersNotFoundException ex) {
        return ex.getMessage();
    }

}
