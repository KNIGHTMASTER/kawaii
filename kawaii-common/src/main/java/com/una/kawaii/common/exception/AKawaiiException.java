package com.una.kawaii.common.exception;

import org.apache.log4j.Logger;

import java.io.Serializable;

/**
 * created on 9/29/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public abstract class AKawaiiException extends Exception implements Serializable {

    private static final long serialVersionUID = 8337615067788736480L;

    private Logger logger = Logger.getLogger(AKawaiiException.class);

    public AKawaiiException(String p_Message) {
        this(p_Message, null);
    }

    public AKawaiiException(String p_Message, Throwable p_Throwable) {
        super(p_Message, p_Throwable);
        if (p_Message != null && p_Throwable != null) {
            logger.info(p_Message);
            p_Throwable.printStackTrace();

        } else {
            if (p_Message != null) {
                logger.info(p_Message);
            }
            if (p_Throwable != null) {
                logger.error(p_Throwable);
                p_Throwable.printStackTrace();
            }
        }
    }
}

