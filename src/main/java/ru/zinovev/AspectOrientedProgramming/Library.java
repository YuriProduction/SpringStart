package ru.zinovev.AspectOrientedProgramming;

import org.springframework.stereotype.Component;

@Component
public class Library {
    public void getBook() {
        System.out.println("Taking the book...");
    }
}
