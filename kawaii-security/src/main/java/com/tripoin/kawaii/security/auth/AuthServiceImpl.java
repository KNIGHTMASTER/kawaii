package com.tripoin.kawaii.security.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Service
public class AuthServiceImpl implements IAuthService{

/*    @Autowired
    RepoUser repoUser;*/
    
    @Override
    public int login(String p_Code, String p_Password) {
        /*int result = 0;
        List<ModelUser> users = repoUser.authenticateUser(p_Code, p_Password);
        if (users.size() == 1){
            result = 1;
        }
        return result;*/
        return 0;
    }

}
