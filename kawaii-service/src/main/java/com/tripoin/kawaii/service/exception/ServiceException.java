package com.tripoin.kawaii.service.exception;

import com.tripoin.kawaii.common.exception.AKawaiiException;

/**
 * created on 11/9/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class ServiceException extends AKawaiiException {
    private static final long serialVersionUID = -6173375850331440335L;

    public ServiceException(String p_Message) {
        super(p_Message);
    }

    public ServiceException(String p_Message, Throwable p_Throwable) {
        super(p_Message, p_Throwable);
    }
}
