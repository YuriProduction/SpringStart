package ru.zinovev.AspectOrientedProgramming;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ru.zinovev.AspectOrientedProgramming")
@EnableAspectJAutoProxy
public class SpringConfigAspects {
}
