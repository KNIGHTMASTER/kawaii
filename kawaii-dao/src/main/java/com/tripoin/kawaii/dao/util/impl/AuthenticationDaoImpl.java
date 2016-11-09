package com.tripoin.kawaii.dao.util.impl;


import com.tripoin.kawaii.dao.constant.DaoConstant;
import com.tripoin.kawaii.dao.util.IAuthenticationDao;
import com.tripoin.kawaii.security.data.mapper.SecurityUserDetailMapper;
import com.tripoin.kawaii.security.data.user.SecurityUserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * @author <a href="mailto:ridla.fadilah@gmail.com">Ridla Fadilah</a>
 */
@Repository(DaoConstant.Bean.AUTHENTICATION_DAO_BEAN)
public class AuthenticationDaoImpl implements IAuthenticationDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final RowMapper<SecurityUserDetail> securityUserDetailsMapper = new SecurityUserDetailMapper();

	@Override
	public SecurityUserDetail login(String username) throws Exception {
		return jdbcTemplate.queryForObject(DaoConstant.Query.LOGIN, new Object[]{username, username, username}, securityUserDetailsMapper);
	}

	@Override
	public int change(String username, String secret) throws Exception {
		return jdbcTemplate.update(DaoConstant.Query.AUTHENTICATION_CHANGE, new Object[]{username, secret});
	}

}
