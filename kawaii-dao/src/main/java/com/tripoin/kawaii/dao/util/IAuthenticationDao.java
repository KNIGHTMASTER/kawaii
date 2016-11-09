package com.tripoin.kawaii.dao.util;

import com.tripoin.kawaii.security.data.user.SecurityUserDetail;

/**
 * @author <a href="mailto:ridla.fadilah@gmail.com">Ridla Fadilah</a>
 */
public interface IAuthenticationDao {

	public SecurityUserDetail login(String username) throws Exception;
	
	public int change(String username, String secret) throws Exception;
	
}
