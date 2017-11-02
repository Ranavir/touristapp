package com.stl.touristapp.config;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@FrameworkEndpoint
@RestController
public class RevokeTokenEndpoint {

    @Resource(name = "tokenServices")
    ConsumerTokenServices tokenServices;

    @RequestMapping(method = RequestMethod.POST, value = "/oauth/token/revokeById/{tokenId}")
    public ResponseEntity<String> revokeToken(@PathVariable String tokenId) {
        boolean status = tokenServices.revokeToken(tokenId);
        if (!status) {
            System.out.println("Invalid Token id " + tokenId);
            return new ResponseEntity<String>("FAILED",HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
    }
    
//    @RequestMapping(method = RequestMethod.DELETE, value = "/oauth/token")
//    public ResponseEntity<String> revokeToken(HttpServletRequest request) {
//        String authorization = request.getHeader("Authorization");
//        if (authorization != null && authorization.contains("Bearer")) {
//            String tokenId = authorization.substring("Bearer".length() + 1);
//            boolean status = tokenServices.revokeToken(tokenId);
//            if (status) {
//            	return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
//            }
//            System.out.println("Invalid Token id " + tokenId);
//            return new ResponseEntity<String>("FAILED",HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
//    }

}