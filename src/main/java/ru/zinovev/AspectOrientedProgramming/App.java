package ru.zinovev.AspectOrientedProgramming;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        SpringConfigAspects.class
                );
        Library library = context.getBean("library", Library.class);
        library.getBook();
    }

}
