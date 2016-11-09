package com.tripoin.kawaii.common.util.ftp;


import com.tripoin.kawaii.common.parameter.IParamComponent;
import com.tripoin.kawaii.common.parameter.ParamFTPServer;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Service
public class FTPConnection implements IFTPConnection, IParamComponent<ParamFTPServer> {

    private org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(FTPConnection.class);
    
    private ParamFTPServer paramFTPConnection;

    private FTPClient fTPClient;
    
    public FTPConnection() {
        fTPClient = new FTPClient();        
    }
        
    @Override
    public void contractConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int isConnected() {
        int result = 0;
        String ipServer = paramFTPConnection.getIpServer();
        int ftpPort = Integer.valueOf(paramFTPConnection.getFtpPort());
        String ftpUserName = paramFTPConnection.getFtpUserName();
        String ftpPassword = paramFTPConnection.getFtpPassword();        
        logger.info(paramFTPConnection.toString());
        
        try {
            fTPClient.connect(ipServer, ftpPort);
            getServerReply(fTPClient);
            int replyCode = fTPClient.getReplyCode();
            if (!FTPReply.isPositiveCompletion(replyCode)) {
                logger.info("Operation failed. Server reply code: " + replyCode);
            }
            boolean success = fTPClient.login(ftpUserName, ftpPassword);
            getServerReply(fTPClient);
            if (!success) {                
                logger.info("Could not login to the server");                
            } else {
                result = 1;
                logger.info("Logged in FTP server");
            }
        } catch (IOException ex) {
        }
        return result;
    }
    
    private String getServerReply(FTPClient ftpClient) {
        String[] replies = ftpClient.getReplyStrings();
        String result = "";
        if (replies != null && replies.length > 0) {
            for (String aReply : replies) {
                result = result.concat(" ").concat(aReply);
            }
        }
        return result;
    }

    @Override
    public void setComponent(ParamFTPServer p_Component) {
        this.paramFTPConnection = p_Component;
    }

    @Override
    public ParamFTPServer getComponent() {
        return paramFTPConnection;
    }


}
