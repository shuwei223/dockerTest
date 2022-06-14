package org.javabody.formlogin.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.code.kaptcha.Producer;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.javabody.formlogin.controller.MyAuthenticationProvider;
import org.javabody.formlogin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.security.access.hierarchicalroles.RoleHierarchy;
import org.springframework.security.access.hierarchicalroles.RoleHierarchyImpl;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Properties;

//@Configuration
public class SpringsecurityConfig extends WebSecurityConfigurerAdapter {
//    @Bean
//    PasswordEncoder passwordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
//    }
//    //@Bean
//    MyAuthenticationProvider myAuthenticationProvider(){
//        MyAuthenticationProvider myAuthenticationProvider = new MyAuthenticationProvider();
//        myAuthenticationProvider.setPasswordEncoder(passwordEncoder());
//        myAuthenticationProvider.setUserDetailsService(userDetailsService());
//        return  myAuthenticationProvider;
//    }
//    @Autowired
//    UserService userService;
//
//    //
////    @Override
////    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        auth.inMemoryAuthentication().withUser("11").password("123456").roles("admin")
////                .and().withUser("12").password("123").roles("admin");
////    }
//
//    @Bean
//    Producer verifyCode() {
//        Properties properties = new Properties();
//        properties.setProperty("kaptcha.image.width", "150");
//        properties.setProperty("kaptcha.image.height", "50");
//        properties.setProperty("kaptcha.textproducer.char.string", "0123456789");
//        properties.setProperty("kaptcha.textproducer.char.length", "4");
//        Config config = new Config(properties);
//        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
//        defaultKaptcha.setConfig(config);
//        return defaultKaptcha;
//    }
//    @Bean
//    RoleHierarchy roleHierarchy() {
//        RoleHierarchyImpl roleHierarchy = new RoleHierarchyImpl();
//        roleHierarchy.setHierarchy("ROLE_admin > ROLE_user");
//        return roleHierarchy;
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userService);
//    }
//
//    @Override
//    //@Bean
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        ProviderManager manager = new ProviderManager(Arrays.asList(myAuthenticationProvider()));
//        return manager;
//    }
//    //   @Autowired
////   private DataSource dataSource;
////    @Override
////    @Bean
////    protected UserDetailsService userDetailsService() {
////        //InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
////        JdbcUserDetailsManager manager = new JdbcUserDetailsManager(dataSource);
////        if(!manager.userExists("11")){
////            manager.createUser(User.withUsername("11").password("123").roles("admin").build());
////        }
////       if(!manager.userExists("sw")){
////           manager.createUser(User.withUsername("sw").password("123").roles("user").build());
////       }
////
////        return manager;
////    }
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers("/js/**", "/css/**", "/images/**");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().antMatchers("/vc.jpg")
//                .permitAll().anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .successHandler((req, resp, auth) -> {
//                    resp.setContentType("application/json;charset=utf-8");
//                    PrintWriter out = resp.getWriter();
//                    out.write(new ObjectMapper().writeValueAsString( auth.getPrincipal()));
//                    out.flush();
//                    out.close();
//                })
//                .failureHandler((req, resp, e) -> {
//                    resp.setContentType("application/json;charset=utf-8");
//                    PrintWriter out = resp.getWriter();
//                    out.write(new ObjectMapper().writeValueAsString(e.getMessage()));
//                    out.flush();
//                    out.close();
//                })
//                .permitAll()
//                .and()
//                .csrf().disable();
//    }
//
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        http.authorizeRequests()
////                .antMatchers("/admin/**").hasRole("admin")
////                .antMatchers("/user/**").hasRole("user")
////                .anyRequest().authenticated()
////                .and()
////                .formLogin()
////                .loginPage("/login.html")
////                .loginProcessingUrl("/doLogin")
////                .usernameParameter("name")
////                .passwordParameter("passwd")
////                //.successForwardUrl("/s")
////                .successHandler((req, res, auth) -> {
////                    res.setContentType("application/json;charset=utf-8");
////                    PrintWriter writer = res.getWriter();
////                    writer.write(new ObjectMapper().writeValueAsString(auth.getPrincipal()));
////                    writer.flush();
////                    writer.close();
////                })
////                .failureHandler((req, res, exception) -> {
////                    res.setContentType("application/json;charset=utf-8");
////                    PrintWriter writer = res.getWriter();
////                    writer.write(new ObjectMapper().writeValueAsString(exception.getMessage()));
////                    writer.flush();
////                    writer.close();
////                })
////                .permitAll()
////
////                .and()
////                .logout()
////                .logoutUrl("/logout")
////                .logoutRequestMatcher(new AntPathRequestMatcher("/logOut", "POST"))
////                .and()
////                .rememberMe()
////                .key("sw")
////                .and()
////                .csrf().disable()
////                .exceptionHandling()
////                .authenticationEntryPoint((req, res, exception) -> {
////                    res.setContentType("application/json;charset=utf-8");
////                    PrintWriter writer = res.getWriter();
////                    writer.write(new ObjectMapper().writeValueAsString("请先登录"));
////                    writer.flush();
////                    writer.close();
////                })
////        ;
////    }
}
