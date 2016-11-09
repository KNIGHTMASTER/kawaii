package com.tripoin.kawaii.dao.util;

import com.tripoin.kawaii.data.preload.SystemParameter;

import java.util.List;

/**
 * @author <a href="mailto:ridla.fadilah@gmail.com">Ridla Fadilah</a>
 */
public interface ISystemParameterDao {

	public SystemParameter loadValue(String code) throws Exception;
	
	public List<SystemParameter> listValue(Object[] code) throws Exception;
	
	public List<SystemParameter> getAllSystemParameter() throws Exception;
	
}
