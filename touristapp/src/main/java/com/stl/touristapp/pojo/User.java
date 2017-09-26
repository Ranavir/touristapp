package com.stl.touristapp.pojo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
@Entity
@Table(name = "MEMBER_DETAILS")
public class User implements UserDetails{

	/**
	 * This integer refers to the member loyalty Id.
	 */
	@Id
	@SequenceGenerator(name="seq",sequenceName="LOYALTY_ID_SEQ")        
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq") 
	@Column(name = "LOYALTY_ID")
	@OrderColumn
	private long loyaltyId;
	/**
	 * This String refers to the member password.
	 */
	@Column(name = "MEMBER_PASSWORD")	
	@OrderColumn
	private String password;
	/**
	 * This String refers to the member user Id.
	 */
	@Column(name = "USERID")	
	@OrderColumn
	private String username;
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
