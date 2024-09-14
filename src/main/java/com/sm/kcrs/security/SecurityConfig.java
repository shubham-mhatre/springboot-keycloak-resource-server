//package com.sm.kcrs.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//import lombok.RequiredArgsConstructor;
//
//@Configuration
//@EnableWebSecurity
//@RequiredArgsConstructor
//@EnableMethodSecurity(securedEnabled = true)
//public class SecurityConfig {
//
//	@Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//        .cors().and()
//            .authorizeHttpRequests(authorizeRequests -> 
//                authorizeRequests
//                    .requestMatchers("/public/**").permitAll()
//                    .anyRequest().authenticated()
//            )
//            .oauth2ResourceServer(auth ->
//            auth.jwt(token -> token.jwtAuthenticationConverter(new KeycloakJwtAuthenticationConverter())));
//        return http.build();
//    }
//}
