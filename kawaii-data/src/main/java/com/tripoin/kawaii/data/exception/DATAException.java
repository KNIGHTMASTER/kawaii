package com.tripoin.kawaii.data.exception;

import com.tripoin.kawaii.common.exception.AKawaiiException;

/**
 * created on 9/29/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class DATAException extends AKawaiiException {

    private static final long serialVersionUID = -7313332354862674470L;

    public DATAException(String p_Message) {
        super(p_Message);
    }

    public DATAException(String p_Message, Throwable p_Throwable) {
        super(p_Message, p_Throwable);
    }
}
