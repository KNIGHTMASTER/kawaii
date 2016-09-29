package com.una.kawaii.data.exception;

import com.una.kawaii.common.exception.AKawaiiException;

/**
 * created on 9/29/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class DataException extends AKawaiiException {

    private static final long serialVersionUID = -7313332354862674470L;

    public DataException(String p_Message) {
        super(p_Message);
    }

    public DataException(String p_Message, Throwable p_Throwable) {
        super(p_Message, p_Throwable);
    }
}
