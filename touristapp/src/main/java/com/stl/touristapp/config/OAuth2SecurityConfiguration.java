package com.stl.touristapp.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpMethod;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.approval.ApprovalStore;
import org.springframework.security.oauth2.provider.approval.TokenApprovalStore;
import org.springframework.security.oauth2.provider.approval.TokenStoreUserApprovalHandler;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;
import org.springframework.security.oauth2.provider.error.OAuth2AuthenticationEntryPoint;
import org.springframework.security.oauth2.provider.request.DefaultOAuth2RequestFactory;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;


 
@Configuration
@EnableWebSecurity
public class OAuth2SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
    @Autowired
    private ClientDetailsService clientDetailsService;
    @Autowired
	private UserDetailsService userDetailsService;
    @Value("classpath:schema.sql")
    private Resource schemaScript;
    @Value("classpath:data.sql")
    private Resource dataScript;
    
    @Autowired
    public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//        .withUser("ranavir").password("password").roles("ADMIN").and()
//        .withUser("stl").password("techlab").roles("USER");
        
        auth.userDetailsService(userDetailsService);//.passwordEncoder(passwordEncoder());
    }
    @Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
    @Bean
	public CorsFilter corsFilterBean() throws Exception {
    	CorsFilter corsFilter = new CorsFilter();
		return corsFilter;
	}
    @Bean
    public OAuth2AuthenticationEntryPoint clientAuthenticationEntryPoint(){
    	OAuth2AuthenticationEntryPoint unauthorizedEntry = new OAuth2AuthenticationEntryPoint();
    	return unauthorizedEntry;
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
        csrf().disable()
        .anonymous().disable()
        .exceptionHandling().authenticationEntryPoint(clientAuthenticationEntryPoint()).and()
		// don't create session
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//		.and().authorizeRequests().antMatchers(HttpMethod.OPTIONS,"/oauth/token","/oauth/token/").permitAll()
        .and().authorizeRequests().antMatchers("/api/**").authenticated()
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler())
        .and().addFilterBefore(corsFilterBean(), ChannelProcessingFilter.class);
    }
 
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
 
 
    @Bean
    public TokenStore tokenStore(DataSource dataSource) {
    	return new JdbcTokenStore(dataSource);
    }
 
    @Bean
    @Autowired
    public TokenStoreUserApprovalHandler userApprovalHandler(TokenStore tokenStore){
        TokenStoreUserApprovalHandler handler = new TokenStoreUserApprovalHandler();
        handler.setTokenStore(tokenStore);
        handler.setRequestFactory(new DefaultOAuth2RequestFactory(clientDetailsService));
        handler.setClientDetailsService(clientDetailsService);
        return handler;
    }
     
    @Bean
    @Autowired
    public ApprovalStore approvalStore(TokenStore tokenStore) throws Exception {
        TokenApprovalStore store = new TokenApprovalStore();
        store.setTokenStore(tokenStore);
        return store;
    }
    @Bean
    public DataSourceInitializer dataSourceInitializer(DataSource dataSource) {
        DataSourceInitializer initializer = new DataSourceInitializer();
        initializer.setDataSource(dataSource);
        initializer.setDatabasePopulator(databasePopulator());
        return initializer;
    }
     
    private DatabasePopulator databasePopulator() {
        ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
        populator.addScript(schemaScript);
        populator.addScript(dataScript);
        return populator;
    }
}