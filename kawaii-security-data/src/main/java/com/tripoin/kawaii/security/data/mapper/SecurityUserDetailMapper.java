package com.tripoin.kawaii.security.data.mapper;

import com.tripoin.kawaii.security.data.user.SecurityUserDetail;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.core.userdetails.UserDetails;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * created on 11/9/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class SecurityUserDetailMapper implements RowMapper<SecurityUserDetail> {

    public SecurityUserDetail mapRow(ResultSet rs, int rowNum) throws SQLException {
        SecurityUserDetail securityUserDetails = new SecurityUserDetail();
        securityUserDetails.setUsername(rs.getString("client_id"));
        securityUserDetails.setPassword(rs.getString("client_secret"));
        securityUserDetails.setEnabled(getBoolean(rs.getInt("user_enabled")));
        securityUserDetails.setAccountNonExpired(getBoolean(rs.getDate("user_expired_date")));
        securityUserDetails.setCredentialsNonExpired(getBoolean(rs.getDate("user_credentials_expired_date")));
        securityUserDetails.setAccountNonLocked(getBoolean(rs.getInt("user_non_locked")));
        securityUserDetails.setAuthorities(rs.getString("role_code"));
        return securityUserDetails;
    }

    private boolean getBoolean(int data) {
        return data == 1 ? true : false;
    }

    private boolean getBoolean(Date date) {
        if(date != null){
            if(date.compareTo(new Date(new java.util.Date().getTime())) >= 0)
                return true;
            else
                return false;
        }else
            return true;
    }
}
