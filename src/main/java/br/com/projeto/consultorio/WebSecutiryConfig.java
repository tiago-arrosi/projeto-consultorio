package br.com.projeto.consultorio;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecutiryConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.anyRequest().authenticated()
		.and()
		.formLogin(form -> form.loginPage("/login").defaultSuccessUrl("/home", true).permitAll())
		.logout(logout -> logout.logoutUrl("/logout"));
		/*.httpBasic();*/		
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		/*UserDetails user =
				 User.builder()
					.username("tiago")
					.password(encoder.encode("tiago"))
					.roles("ADM")
					.build();
		
		UserDetails userJai =
				 User.builder()
					.username("jai")
					.password(encoder.encode("jai"))
					.roles("ADM")
					.build();*/
		
		auth.jdbcAuthentication()
			.dataSource(dataSource)
			.passwordEncoder(encoder);
			/*.withUser(user)
			.withUser(userJai);*/
	}
}
