package com.tripoin.kawaii.dao.util.impl;

import com.tripoin.kawaii.dao.constant.DaoConstant;
import com.tripoin.kawaii.dao.util.ISystemParameterDao;
import com.tripoin.kawaii.data.mapper.SystemParameterMapper;
import com.tripoin.kawaii.data.preload.SystemParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author <a href="mailto:ridla.fadilah@gmail.com">Ridla Fadilah</a>
 */
@Repository(DaoConstant.Bean.SYSTEM_PARAMETER_DAO_BEAN)
public class SystemParameterDaoImpl implements ISystemParameterDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final RowMapper<SystemParameter> systemParameterMapper = new SystemParameterMapper();

	@Override
	public SystemParameter loadValue(String code) throws Exception {
		return jdbcTemplate.queryForObject(DaoConstant.Query.SYS_PARAM_LOAD_VALUE, new Object[]{code}, systemParameterMapper);
	}

	@Override
	public List<SystemParameter> listValue(Object[] code) throws Exception {
		return jdbcTemplate.query(DaoConstant.Query.SYS_PARAM_LIST_VALUE, code, systemParameterMapper);
	}

	@Override
	public List<SystemParameter> getAllSystemParameter() throws Exception {
		return jdbcTemplate.query(DaoConstant.Query.SYS_PARAM_ALL, systemParameterMapper);
	}

}
