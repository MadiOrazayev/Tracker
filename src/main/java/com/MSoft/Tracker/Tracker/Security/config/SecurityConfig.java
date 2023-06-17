package com.MSoft.Tracker.Tracker.Security.config;

import com.MSoft.Tracker.Tracker.Security.SUsers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
    @Bean
    public SUsers Susers(){
        return new SUsers();
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        AuthenticationManagerBuilder authenticationManagerBuilder=
                http.getSharedObject(AuthenticationManagerBuilder.class);
        authenticationManagerBuilder.userDetailsService(Susers()).passwordEncoder(passwordEncoder());

        http.formLogin()
                .loginPage("/sign-in")
                .loginProcessingUrl("/to-enter")
                .failureUrl("/")
                .defaultSuccessUrl("/profile")
                .usernameParameter("username")
                .passwordParameter("password");
        http.logout()
                .logoutUrl("/to-exit")
                .logoutSuccessUrl("/");
        http.csrf().disable();
        return http.build();

    }
}
