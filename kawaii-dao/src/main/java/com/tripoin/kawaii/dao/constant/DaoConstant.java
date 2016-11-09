package com.tripoin.kawaii.dao.constant;

/**
 * created on 11/8/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface DaoConstant {

    interface Bean{
        String AUTHENTICATION_DAO_BEAN = "authentication_dao_bean";
        String SYSTEM_PARAMETER_DAO_BEAN = "system_parameter_dao_bean";
    }

    interface Query{
        String SYS_PARAM_LOAD_VALUE = "SELECT * FROM sys_system_parameter WHERE system_parameter_code = ?";
        String SYS_PARAM_LIST_VALUE = "SELECT * FROM sys_system_parameter WHERE system_parameter_code = ? OR system_parameter_code = ?";
        String SYS_PARAM_ALL = "SELECT * FROM sys_system_parameter";
        String SELECT_LOV = "SELECT id, name FROM #{#entityName}";
        String LOGIN = "SELECT "
                + "ocd.client_id, ocd.client_secret, sud.user_enabled, "
                + "sud.user_expired_date, sud.user_credentials_expired_date, sud.user_non_locked, sr.role_code "
                + "FROM sec_user_details sud "
                + "JOIN oauth_client_details ocd ON sud.client_id = ocd.client_id "
                + "JOIN sec_role sr ON sud.role_id = sr.role_id "
                + "JOIN mst_profile mp ON mp.user_id = sud.user_id "
                + "WHERE ocd.client_id = ? OR mp.profile_email = ? OR mp.profile_phone = ?";
        String AUTHENTICATION_CHANGE = "UPDATE oauth_client_details "
                + "SET client_secret = ? WHERE client_id = ?";
    }

    int STATUS_APPROVED = 1;
    int STATUS_CANCELLED = 0;
}
