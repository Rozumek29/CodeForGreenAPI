package com.github.rozumek29.codeforgreenapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails redactor = User.withDefaultPasswordEncoder()
                .username("Redactor")
                .password("zaq1@WSX")
                .roles("REDACTOR")
                .build();

        return new InMemoryUserDetailsManager(redactor);
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests()
                .antMatchers("/api/getallplants").permitAll()
                .antMatchers("/api/getPlantByIndex").permitAll()
                .antMatchers("/api/addPlant").hasRole("REDACTOR")
                .and().formLogin().permitAll()
                .and().logout().permitAll()
                .and().csrf().disable();
    }


}
