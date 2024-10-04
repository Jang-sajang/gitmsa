package com.pmh.ex10.conf;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configurable
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

            http.csrf( csrf -> csrf.disable());
            http.csrf( form -> form.disable());
            http.csrf( basic -> basic.disable());


        //이부분만 잘 관리하면 된다
        http.authorizeHttpRequests(auth -> auth
                //일반사용자 접근가능
                .requestMatchers("/login", "/join","/","/freeboard/**", "/user/**").permitAll()
                //ADMIN으로 role을 가지고 있을 때 접근 가능하다
                .requestMatchers("/admin").hasRole("ADMIN")
                .anyRequest().authenticated());
        //세션 로그인방식 안하겠따는 뜻
        http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        return http.build();
    }
}
