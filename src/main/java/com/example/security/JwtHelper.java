package com.example.security;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtHelper {

    //requirement :
    public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60;

    //    public static final long JWT_TOKEN_VALIDITY =  60;
    private String secret = "afafasfafafasfasfasfafacasdasfasxASFACASDFACASDFASFASFDAFASFASDAADSCSDFADCVSGCFVADXCcadwavfsfarvf";

    //retrieve username from jwt token
    public String getUsernameFromToken(String token) {
    	System.out.println("Inside the JwtHelper....1");
    	String str =getClaimFromToken(token, Claims::getSubject);
    	System.out.println("Inside the JwtHelper....1 "+str);
        return str;
    }

    //retrieve expiration date from jwt token
    public Date getExpirationDateFromToken(String token) {
    	System.out.println("Inside the JwtHelper....2");
        return getClaimFromToken(token, Claims::getExpiration);
    }

    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
    	System.out.println("Inside the JwtHelper....3 ");
        final Claims claims = getAllClaimsFromToken(token);
        System.out.println("Inside the JwtHelper....3"+claims);
        return claimsResolver.apply(claims);
    }

    //for retrieveing any information from token we will need the secret key
    private Claims getAllClaimsFromToken(String token) {
    	System.out.println("Inside the JwtHelper....4 ");
    	Claims cms = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
    	System.out.println("Inside the JwtHelper....4 "+cms);
        return cms;
    }

    //check if the token has expired
    private Boolean isTokenExpired(String token) {
    	System.out.println("Inside the JwtHelper....5");
        final Date expiration = getExpirationDateFromToken(token);
        return expiration.before(new Date());
    }

    //generate token for user
    public String generateToken(UserDetails userDetails) {
        Map<String, Object> claims = new HashMap<>();
        System.out.println("Inside the JwtHelper....6 "+claims);
        String str = doGenerateToken(claims, userDetails.getUsername());
        System.out.println("Inside the JwtHelper....6 "+str);
        return str;
    }

    //while creating the token -
    //1. Define  claims of the token, like Issuer, Expiration, Subject, and the ID
    //2. Sign the JWT using the HS512 algorithm and secret key.
    //3. According to JWS Compact Serialization(https://tools.ietf.org/html/draft-ietf-jose-json-web-signature-41#section-3.1)
    //   compaction of the JWT to a URL-safe string
    private String doGenerateToken(Map<String, Object> claims, String subject) {
    	System.out.println("Inside the JwtHelper....7");
        return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY * 1000))
                .signWith(SignatureAlgorithm.HS512, secret).compact();
    }

    //validate token
    public Boolean validateToken(String token, UserDetails userDetails) {
        final String username = getUsernameFromToken(token);
        System.out.println("Inside the JwtHelper....8" + username);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }


}
