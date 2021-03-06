package com.tripoin.kawaii.dao.scaffolding;

import com.tripoin.kawaii.dao.constant.DaoConstant;
import com.tripoin.kawaii.dao.exception.DAOException;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * created on 11/8/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 * @param <ID>
 */
@Transactional
public interface IApprovalDAO<ID extends Serializable> {

    @Modifying
    @Query("UPDATE #{#entityName} a set a.status = "+ DaoConstant.STATUS_APPROVED)
    void approveAll() throws DAOException;

    @Modifying
    @Query("UPDATE #{#entityName} a set a.status = "+DaoConstant.STATUS_APPROVED+" where a.id = ?1")
    void approveSingleData(ID p_Id) throws DAOException;


}
