//package com.koddokariery.library.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http.csrf().disable();
//
//        http.authorizeRequests()
//                .antMatchers("/api/books", "/index.html", "login.html", "/api/users", "/api/rents").permitAll()
//                .anyRequest().authenticated();
//
////        http.httpBasic();
//
//        http.formLogin()
//                .loginPage("/login.html")
//                .defaultSuccessUrl("/view/logged-user")
//                .permitAll();
//        http.logout()
//                .logoutUrl("/logout")
//                .permitAll();
//
//    }
//
////    @Override
////    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        auth.inMemoryAuthentication()
////                .withUser("user").password("pass").roles("USER")
////                .and()
////                .withUser("admin").password("admin").roles("ADMIN");
////    }
//
//
////    @Bean
////    @Override
////    protected UserDetailsService userDetailsService() {
////        return new UserDetailsServiceImpl();
////    }
////
////    @Bean
////    PasswordEncoder passwordEncoder() {
////        return new BCryptPasswordEncoder();
////    }
//}
