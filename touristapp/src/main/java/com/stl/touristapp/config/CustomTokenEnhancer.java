package com.stl.touristapp.config;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import com.stl.touristapp.pojo.User;

public class CustomTokenEnhancer implements TokenEnhancer {

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		final Map<String, Object> additionalInfo = new HashMap<>();
        additionalInfo.put("organization", "STL");
        Collection<? extends GrantedAuthority> grantedAuths = ((User) authentication.getPrincipal()).getAuthorities();
        StringBuffer sbAuths = new StringBuffer();
        Iterator<? extends GrantedAuthority> itrAuths = grantedAuths.iterator();
        while(itrAuths.hasNext()){
        	sbAuths.append(itrAuths.next().getAuthority());
        	if(itrAuths.hasNext()){
        		sbAuths.append(" ");
        	}
        }
        additionalInfo.put("authorities", sbAuths);
        ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(additionalInfo);
        return accessToken;
	}

}
