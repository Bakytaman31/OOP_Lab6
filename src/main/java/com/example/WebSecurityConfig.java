package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
                .withUser("Manager")
                .password("pass")
                .roles("Manager")
                .and()
                .withUser("Zamdir")
                .password("pass")
                .roles("Zamdir")
                .and()
                .withUser("Sales")
                .password("pass")
                .roles("Sales")
                .and()
                .withUser("Tex")
                .password("pass")
                .roles("Tex");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/zamdir").hasRole("Zamdir")
                .antMatchers("/sales").hasRole("Sales")
                .antMatchers("/tex").hasRole("Tex")
                .antMatchers("/manager").hasRole("Manager")
                .and().formLogin();
    }

    @Bean
    public PasswordEncoder encoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}
