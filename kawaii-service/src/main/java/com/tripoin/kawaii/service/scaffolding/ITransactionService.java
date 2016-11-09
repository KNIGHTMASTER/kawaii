package com.tripoin.kawaii.service.scaffolding;

import com.tripoin.kawaii.service.exception.ServiceException;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 * @param <DATA>
 * @param <ID>
 */
@Transactional
public interface ITransactionService<DATA, ID> extends ICancellationService<ID>, IApprovalService<ID> {

	/*Insert*/
	void insert(DATA p_DATA) throws ServiceException;

	void insertAndFlush(DATA p_DATA) throws ServiceException;

	void insertCollection(List<DATA> p_DATA)  throws ServiceException;

	/*Update*/
	void updateBaseData(ID p_Id, String p_Code, String p_Name, String p_Remarks)  throws ServiceException;


	/*Delete*/
	void delete(ID p_ID)  throws ServiceException;

	void deleteByEntity(DATA p_DATA)  throws ServiceException;

	void deleteCollection(List<DATA> p_DATA)  throws ServiceException;

	
}
