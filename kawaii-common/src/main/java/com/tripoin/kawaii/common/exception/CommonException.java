package com.tripoin.kawaii.common.exception;

/**
 * created on 9/29/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class CommonException extends AKawaiiException {

    private static final long serialVersionUID = 1277320081732599052L;

    public CommonException(String p_Message) {
        super(p_Message);
    }

    public CommonException(String p_Message, Throwable p_Throwable) {
        super(p_Message, p_Throwable);
    }

}
