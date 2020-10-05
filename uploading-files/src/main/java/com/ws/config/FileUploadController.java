package com.ws.config;

import com.jcraft.jsch.ChannelSftp;
import com.ws.config.util.CommonUtil;
import com.ws.config.util.SftpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

@Controller
public class FileUploadController {

    @Autowired
    private SftpClient sftpClient;

    @RequestMapping(value="/establish-connection", method=RequestMethod.GET)
    public @ResponseBody String establishConnection() {
        try{
            sftpClient.connect();
            List<String> fileNameList = new ArrayList<>();
            Vector filelist = sftpClient.viewAllFilesOnPath("/abg-taleo-uat/");
            for(int i=0; i<filelist.size();i++){
                ChannelSftp.LsEntry entry = (ChannelSftp.LsEntry) filelist.get(i);
                if (entry.getFilename().endsWith(".csv")) {
                    fileNameList.add(entry.getFilename());
                }
            }
            if(fileNameList!=null && fileNameList.size()>0){
                for(String s : fileNameList){
                    try{
                        sftpClient.download("/abg-taleo-uat/"+s,"D:/");
                        List<String[]> data = CommonUtil.getCsvFileData("D:/"+s);
                    }catch(Exception e){

                    }
                }

            }

            return "SUCCESS";
        }catch(Exception e){
            e.printStackTrace();
        }
        return "SUCCESS";
    }

    @RequestMapping(value="/upload", method=RequestMethod.POST)
    public @ResponseBody String handleFileUpload(@RequestParam("name") String name,
            @RequestParam("file") MultipartFile file){
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                BufferedOutputStream stream =
                        new BufferedOutputStream(new FileOutputStream(new File(name)));
                stream.write(bytes);
                stream.close();
                return "You successfully uploaded " + name + "!";
            } catch (Exception e) {
                return "You failed to upload " + name + " => " + e.getMessage();
            }
        } else {
            return "You failed to upload " + name + " because the file was empty.";
        }
    }

}
