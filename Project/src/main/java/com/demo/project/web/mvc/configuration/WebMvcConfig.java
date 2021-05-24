package com.demo.project.web.mvc.configuration;

import com.demo.project.persistence.entities.User;
import com.demo.project.persistence.enums.RoleEnum;
import com.demo.project.persistence.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("deprecation")
@EnableWebMvc
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

   /* @Autowired
    public WebMvcConfig(UserRepository userRepository) {
        // Ceci n'est pas à recopier en production
        List<RoleEnum> userRole = Collections.singletonList(RoleEnum.USER);
        List<RoleEnum> adminRole = Arrays.asList(RoleEnum.USER, RoleEnum.ADMINISTRATOR);
        User user = new User("user", "user", "User", "USER", userRole);
        User adminUser = new User("admin", "admin", "Admin", "ADMIN", adminRole);
        userRepository.save(user);
        userRepository.save(adminUser);
    }*/

	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/auth").setViewName("auth/auth");
        registry.addViewController("/auth/admin").setViewName("auth/admin");
    }
}