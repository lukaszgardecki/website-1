package com.example.app.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // to show H2 console:
        http.csrf(csrf -> csrf.ignoringRequestMatchers(PathRequest.toH2Console()))
                .headers().frameOptions().sameOrigin();

        return http.authorizeHttpRequests(requests -> requests
                        .requestMatchers("/").permitAll()
                        .requestMatchers("/styles/**", "/scripts/**", "/img/**").permitAll()
                        .requestMatchers(PathRequest.toH2Console()).permitAll()
                        .anyRequest().permitAll())
                .build();
    }
}
