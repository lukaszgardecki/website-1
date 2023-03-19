package com.example.app.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(requests -> requests
                    .requestMatchers("/").permitAll()
                    .requestMatchers("/styles/**", "/scripts/**", "/img/**").permitAll()
                    .requestMatchers(PathRequest.toH2Console()).permitAll()
                    .anyRequest().authenticated())
             .formLogin(login -> login
                    .loginPage("/").permitAll()
                    .successForwardUrl("/success-login"))
             .logout(logout -> logout
                     .logoutRequestMatcher(new AntPathRequestMatcher("/logout/**", HttpMethod.GET.name()))
                     .logoutSuccessUrl("/?logout").permitAll())
                // to show H2 console:
             .csrf(csrf -> csrf.ignoringRequestMatchers(PathRequest.toH2Console()))
             .headers().frameOptions().sameOrigin();
        return http.build();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}
