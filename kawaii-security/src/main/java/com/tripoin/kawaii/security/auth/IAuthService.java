package com.tripoin.kawaii.security.auth;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface IAuthService {
    /**
     * 1 = true
     * 0 = false
     * @return value of authentication process
     * @param p_Code user code
     * @param p_Password user password
     */
    int login(String p_Code, String p_Password);
    
}
