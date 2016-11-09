package com.tripoin.kawaii.service.scaffolding.impl;

import com.tripoin.kawaii.dao.scaffolding.IScaffoldingDAO;
import com.tripoin.kawaii.dao.exception.DAOException;
import com.tripoin.kawaii.service.constant.ServiceConstant;
import com.tripoin.kawaii.service.scaffolding.IScaffoldingService;
import com.tripoin.kawaii.service.scaffolding.IServiceInitializer;
import org.hibernate.service.spi.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 * @param <DATA>
 */
@Service(ServiceConstant.BeanName.SCAFFOLDING_SERVICE_BEAN)
public abstract class AScaffoldingService<DATA> implements IScaffoldingService<DATA>, IServiceInitializer {

	private static Logger LOGGER = LoggerFactory.getLogger(AScaffoldingService.class);

	protected IScaffoldingDAO<DATA> scaffoldingDAO;

	/*Inquiry*/
	/*======================================================================================================*/
	@Override
	public List<DATA> findAll() throws ServiceException {
		return scaffoldingDAO.findAll();
	}

	@Override
	public Page<DATA> findAll(Pageable p_Pageable) {
		return scaffoldingDAO.findAll(p_Pageable);
	}

	@Override
	public DATA findById(Long p_ID) throws ServiceException {
		return scaffoldingDAO.findOne(p_ID);
	}

	@Override
	public List<DATA> findByCode(String p_Code) throws ServiceException {
		try {
			return scaffoldingDAO.findByCodeLike(p_Code);
		} catch (DAOException e) {
			LOGGER.error(e.getMessage());
			return null;
		}
	}

	@Override
	public List<DATA> findByCodeOrderByIdAsc(String p_Code) throws ServiceException {
		try {
			return scaffoldingDAO.findByCodeLikeOrderByIdAsc(p_Code);
		} catch (DAOException e) {
			LOGGER.error(e.getMessage());
			return null;
		}
	}

	@Override
	public List<DATA> findByCodeOrderByCodeAsc(String p_Code) throws ServiceException {
		try {
			return scaffoldingDAO.findByCodeLikeOrderByCodeAsc(p_Code);
		} catch (DAOException e) {
			LOGGER.error(e.getMessage());
			return null;
		}
	}

	@Override
	public List<DATA> findByCodeOrderByCodeDesc(String p_Code) throws ServiceException {
		try {
			return scaffoldingDAO.findByCodeLikeOrderByCodeDesc(p_Code);
		} catch (DAOException e) {
			LOGGER.error(e.getMessage());
			return null;
		}
	}

	@Override
	public Page<DATA> findByCodeOrderByCodeAsc(String p_Code, Pageable p_Pageable) throws ServiceException {
		try {
			return scaffoldingDAO.findByCodeLikeOrderByCodeAsc(p_Code, p_Pageable);
		} catch (DAOException e) {
			LOGGER.error(e.getMessage());
			return null;
		}
	}

	@Override
	public List<DATA> findByName(String p_Name) throws ServiceException {
		try {
			return scaffoldingDAO.findByNameLike(p_Name);
		} catch (DAOException e) {
			LOGGER.error(e.getMessage());
			return null;
		}
	}

	@Override
	public List<DATA> findByNameOrderByIdAsc(String p_Name) throws ServiceException {
		try {
			return scaffoldingDAO.findByNameLikeOrderByIdAsc(p_Name);
		} catch (DAOException e) {
			LOGGER.error(e.getMessage());
			return null;
		}
	}

	@Override
	public List<DATA> findByNameOrderByNameAsc(String p_Name) throws ServiceException {
		try {
			return scaffoldingDAO.findByNameLikeOrderByNameAsc(p_Name);
		} catch (DAOException e) {
			LOGGER.error(e.getMessage());
			return null;
		}
	}

	@Override
	public List<DATA> findByNameOrderByNameDesc(String p_Name) throws ServiceException {
		try {
			return scaffoldingDAO.findByNameLikeOrderByNameDesc(p_Name);
		} catch (DAOException e) {
			LOGGER.error(e.getMessage());
			return null;
		}
	}

	@Override
	public Page<DATA> findByNameOrderByNameAsc(String p_Name, Pageable p_Pageable) throws ServiceException {
		try {
			return scaffoldingDAO.findByNameLikeOrderByNameAsc(p_Name, p_Pageable);
		} catch (DAOException e) {
			LOGGER.error(e.getMessage());
			return null;
		}
	}

	@Override
	public List<DATA> selectLOV() {
		try {
			return  scaffoldingDAO.selectLOV();
		} catch (DAOException e) {
			LOGGER.error(e.getMessage());
			return null;
		}
	}

	@Override
	public List<String> getPhysicalColumnNames() {
		// TODO Auto-generated method stub
		return null;
	}

	/*Transaction*/
	/*======================================================================================================*/

	@Override
	public void insert(DATA p_DATA) throws ServiceException {
		scaffoldingDAO.save(p_DATA);
	}

	@Override
	public void insertAndFlush(DATA p_DATA) throws ServiceException{
		scaffoldingDAO.saveAndFlush(p_DATA);
	}

	@Override
	public void insertCollection(List<DATA> p_DATA) throws ServiceException{
		scaffoldingDAO.save(p_DATA);
	}

	@Override
	public void updateBaseData(Long p_Id, String p_Code, String p_Name, String p_Remarks) throws ServiceException{
		try {
			scaffoldingDAO.setBaseDataById(p_Id, p_Code, p_Name, p_Remarks);
		} catch (DAOException e) {
			LOGGER.error(e.getMessage());
		}
	}

	@Override
	public void delete(Long p_ID) throws ServiceException{
		scaffoldingDAO.delete(p_ID);
	}

	@Override
	public void deleteByEntity(DATA p_DATA) throws ServiceException{
		scaffoldingDAO.delete(p_DATA);
	}

	@Override
	public void deleteCollection(List<DATA> p_DATA) {
		scaffoldingDAO.delete(p_DATA);
	}

	@Override
	public void approveAll() {
		try {
			scaffoldingDAO.approveAll();
		} catch (DAOException e) {
			LOGGER.error(e.getMessage());
		}
	}

	@Override
	public void approveSingleData(Long p_ID) throws ServiceException {
		try {
			scaffoldingDAO.approveSingleData(p_ID);
		} catch (DAOException e) {
			LOGGER.error(e.getMessage());
		}
	}

	@Override
	public void cancelAll() {
		try {
			scaffoldingDAO.cancelAll();
		} catch (DAOException e) {
			LOGGER.error(e.getMessage());
		}
	}

	@Override
	public void cancelSingleData(Long p_ID) throws ServiceException {
		try {
			scaffoldingDAO.cancelSingleData(p_ID);
		} catch (DAOException e) {
			LOGGER.error(e.getMessage());
		}
	}
}
