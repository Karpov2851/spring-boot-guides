package com.ws.config.util;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Created by vikas on 04-09-2019.
 */
public class CommonUtil {

    public static List<String[]> getCsvFileData(String filePath) throws IOException {

        try(CSVReader reader = new CSVReader(new FileReader(filePath))){
            List<String[]> data =  reader.readAll();
            //remove headers
            data.remove(0);
            return data;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
