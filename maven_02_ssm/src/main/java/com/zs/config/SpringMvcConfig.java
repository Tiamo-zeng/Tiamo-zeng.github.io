package com.zs.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.zs.controller","com.zs.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
