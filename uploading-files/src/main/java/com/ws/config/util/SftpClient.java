package com.ws.config.util;

import com.jcraft.jsch.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Vector;

/**
 * Created by vikas on 30-08-2019.
 */
@Component
public class SftpClient {
    private String host = "sftp.ripplehire.com";
    private int port = 22;
    private Session session = null;

    @Value("${private-key-path}")
    private String privateKeyPath;

    public SftpClient() {
    }

    public void connect() throws JSchException {
        JSch jsch = new JSch();
        jsch.addIdentity("D:/WorkSpace/Spring-Guides/spring-guides/uploading-files/src/main/resources/abg-taleo-uat.ppk");
        session = jsch.getSession("abg-taleo-uat", host, port);
        session.setConfig("StrictHostKeyChecking", "no");
        session.connect();
    }

    public void download(String source, String destination) throws JSchException, SftpException {
        Channel channel = session.openChannel("sftp");
        channel.connect();
        ChannelSftp sftpChannel = (ChannelSftp) channel;
        sftpChannel.get(source, destination);
        sftpChannel.exit();
    }

    public Vector viewAllFilesOnPath(String source)throws JSchException, SftpException {
        Channel channel = session.openChannel("sftp");
        channel.connect();
        ChannelSftp sftpChannel = (ChannelSftp) channel;
        return sftpChannel.ls(source);
    }
}
