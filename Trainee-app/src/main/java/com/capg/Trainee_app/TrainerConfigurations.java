package com.capg.Trainee_app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.capg.Trainee_app")
@PropertySource("app.properties")
public class TrainerConfigurations {

}
