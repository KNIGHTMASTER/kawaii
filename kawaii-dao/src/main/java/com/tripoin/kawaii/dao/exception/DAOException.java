package com.tripoin.kawaii.dao.exception;

import com.tripoin.kawaii.common.exception.AKawaiiException;

/**
 * created on 9/29/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class DAOException extends AKawaiiException {

    private static final long serialVersionUID = 5857473834808799543L;

    public DAOException(String p_Message) {
        super(p_Message);
    }

    public DAOException(String p_Message, Throwable p_Throwable) {
        super(p_Message, p_Throwable);
    }
}
