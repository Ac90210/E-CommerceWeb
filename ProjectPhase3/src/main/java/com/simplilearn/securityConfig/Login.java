package com.simplilearn.securityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableWebSecurity
public class Login extends WebSecurityConfigurerAdapter{
	
	 @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	        auth.inMemoryAuthentication()
	               .withUser("admin")
	               .password(passwordEncoder().encode("admin@123")) 
	               .roles("ADMIN");
	    }
	 @Override
	 protected void configure(HttpSecurity http) throws Exception {
	     http
	        .authorizeRequests()
	            .antMatchers("/login").permitAll() 
	            .anyRequest().authenticated() 
	        .and()
	        .formLogin()
	            .loginPage("/login")
	            .permitAll(); 
	 }

	    @Bean
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }

}
