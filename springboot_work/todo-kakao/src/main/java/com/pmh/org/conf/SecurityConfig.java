package com.pmh.org.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
// 모든필터는 없는상환
        //5버전
        httpSecurity.csrf(httpSecurityCsrfConfigurer -> httpSecurityCsrfConfigurer.disable());
        httpSecurity.formLogin(httpSecurityCsrfConfigurer -> httpSecurityCsrfConfigurer.disable());
        httpSecurity.httpBasic(httpSecurityHttpBasicConfigurer -> httpSecurityHttpBasicConfigurer.disable());

//        httpSecurity.sessionManagement(httpSecuritySessionManagementConfigurer ->
//                httpSecuritySessionManagementConfigurer.sessionCreationPolicy(Session))

        return httpSecurity.build();
    }
}
