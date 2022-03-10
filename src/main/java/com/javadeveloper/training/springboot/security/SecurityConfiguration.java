package com.javadeveloper.training.springboot.security;

import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableGlobalAuthentication
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
}
