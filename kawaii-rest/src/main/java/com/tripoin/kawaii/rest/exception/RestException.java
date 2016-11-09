package com.tripoin.kawaii.rest.exception;

import com.tripoin.kawaii.common.exception.AKawaiiException;

/**
 * created on 10/3/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class RestException extends AKawaiiException {

    private static final long serialVersionUID = -2442420615360022986L;

    public RestException(String p_Message) {
        super(p_Message);
    }

    public RestException(String p_Message, Throwable p_Throwable) {
        super(p_Message, p_Throwable);
    }
}
