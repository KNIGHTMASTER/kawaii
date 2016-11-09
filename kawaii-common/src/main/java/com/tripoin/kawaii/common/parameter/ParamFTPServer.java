package com.tripoin.kawaii.common.parameter;

import java.io.Serializable;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class ParamFTPServer implements Serializable{
    
    private static final long serialVersionUID = 575267267634906713L;

    private String ipServer;
    private String ftpPort;
    private String ftpUserName;
    private String ftpPassword;

    public String getIpServer() {
        return ipServer;
    }

    public void setIpServer(String ipServer) {
        this.ipServer = ipServer;
    }

    public String getFtpPort() {
        return ftpPort;
    }

    public void setFtpPort(String ftpPort) {
        this.ftpPort = ftpPort;
    }

    public String getFtpUserName() {
        return ftpUserName;
    }

    public void setFtpUserName(String ftpUserName) {
        this.ftpUserName = ftpUserName;
    }

    public String getFtpPassword() {
        return ftpPassword;
    }

    public void setFtpPassword(String ftpPassword) {
        this.ftpPassword = ftpPassword;
    }

    @Override
    public String toString() {
        return "ParamFTPServer{" + "ipServer=" + ipServer + ", ftpPort=" + ftpPort + ", ftpUserName=" + ftpUserName + ", ftpPassword=" + ftpPassword + '}';
    }
    
    
}
