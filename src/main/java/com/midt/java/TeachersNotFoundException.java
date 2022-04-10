package com.midt.java;

public class TeachersNotFoundException extends RuntimeException {
    public TeachersNotFoundException(Integer id) {
        super("Could not find employee " + id);
    }
}
