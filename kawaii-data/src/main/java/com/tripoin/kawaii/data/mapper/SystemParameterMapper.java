package com.tripoin.kawaii.data.mapper;

import com.tripoin.kawaii.data.constant.IDATAConstant;
import com.tripoin.kawaii.data.preload.SystemParameter;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * created on 11/9/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class SystemParameterMapper implements RowMapper<SystemParameter> {

    public SystemParameter mapRow(ResultSet rs, int rowNum) throws SQLException {
        SystemParameter systemParameter = new SystemParameter();
        systemParameter.setId(rs.getLong(IDATAConstant.ID));
        systemParameter.setCode(rs.getString(IDATAConstant.CODE));
        systemParameter.setName(rs.getString(IDATAConstant.NAME));
        systemParameter.setStatus(rs.getInt(IDATAConstant.STATUS));
        systemParameter.setDescription(rs.getString(IDATAConstant.DESCRIPTION));
        systemParameter.setCreatedBy(rs.getString(IDATAConstant.CREATED_BY));
        systemParameter.setCreatedIp(rs.getString(IDATAConstant.CREATED_BY_IP));
        systemParameter.setCreatedDate(rs.getTimestamp(IDATAConstant.CREATED_DATE));
        systemParameter.setCreatedPlatform(rs.getString(IDATAConstant.CREATED_BY_PLATFORM));
        systemParameter.setModifiedBy(rs.getString(IDATAConstant.MODIFIED_BY));
        systemParameter.setModifiedIp(rs.getString(IDATAConstant.MODIFIED_BY_IP));
        systemParameter.setModifiedDate(rs.getTimestamp(IDATAConstant.MODIFIED_DATE));
        systemParameter.setModifiedPlatform(rs.getString(IDATAConstant.MODIFIED_BY_PLATFORM));
        return systemParameter;
    }
}
