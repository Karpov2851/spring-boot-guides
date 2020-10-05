package com.ws.service;

import com.ws.stub.*;
import com.ws.util.XmlParser;
import org.springframework.stereotype.Service;

import javax.xml.ws.BindingProvider;
import java.net.URL;
import java.util.List;
import java.util.Map;

/**
 * Created by vikas on 07-05-2019.
 */
@Service
public class RehireService {
    final String secretKey = "";
    final String username = "EXTERNAL.USER";
    final String password = "welcome1";

    public void callRehireWs(){
        ObjectFactory objectFactory =new ObjectFactory();

        ReportRequest reportRequest = objectFactory.createReportRequest();
        reportRequest.setAttributeFormat("xml");
        reportRequest.setAttributeLocale("en-US");


        ArrayOfParamNameValue arrayOfParamNameValue = objectFactory.createArrayOfParamNameValue();

        List<ParamNameValue> paramNameValues =  arrayOfParamNameValue.getItem();
        System.out.println("Size: " + paramNameValues.size());


        ParamNameValue pm = new ParamNameValue();
        pm.setUIType("Text");
        pm.setDataType("xsd:string");
        pm.setName("prev_emp_id");
//        itemList.add(pm);

        ParamNameValue pm2 = new ParamNameValue();
        pm2.setUIType("Text");
        pm2.setDataType("xsd:string");
        pm2.setName("date_of_birth");
        ArrayOfString arrayOfString = new ArrayOfString();
        arrayOfString.getItem().add("1984-01-22");
        pm2.setValues(arrayOfString);
//        itemList.add(pm2);

        ParamNameValue pm3 = new ParamNameValue();
        pm3.setUIType("Text");
        pm3.setDataType("xsd:string");
        pm3.setName("p_first_name");
        arrayOfString = new ArrayOfString();
        arrayOfString.getItem().add("Manju");
        pm3.setValues(arrayOfString);
//        itemList.add(pm3);

        ParamNameValue pm4 = new ParamNameValue();
        pm4.setUIType("Text");
        pm4.setDataType("xsd:string");
        pm4.setName("p_last_name");
        arrayOfString = new ArrayOfString();
        arrayOfString.getItem().add("Naganur");
        pm4.setValues(arrayOfString);
//        itemList.add(pm4);

        ParamNameValue pm5 = new ParamNameValue();
        pm5.setUIType("Text");
        pm5.setDataType("xsd:string");
        pm5.setName("pan_no");
        arrayOfString = new ArrayOfString();
        pm5.setValues(arrayOfString);
//        itemList.add(pm5);
        paramNameValues.add(pm);
        paramNameValues.add(pm2);
        paramNameValues.add(pm3);
        paramNameValues.add(pm4);
        paramNameValues.add(pm5);

//        paramNameValues.add()
        reportRequest.setParameterNameValues(arrayOfParamNameValue);
        reportRequest.setReportAbsolutePath("/Custom/MPL Integrations/RippleHire/MPL_RH_REHIRE_CHECK_REP.xdo");
        reportRequest.setSizeOfDataChunkDownload(-1);

        URL wsdlURL = ExternalReportWSSService_Service.WSDL_LOCATION;
        ExternalReportWSSService_Service ss = new ExternalReportWSSService_Service(wsdlURL);
        ExternalReportWSSService externalReportWSSService = ss.getExternalReportWSSService();
        BindingProvider provider = (BindingProvider) externalReportWSSService;
        provider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, username);
        provider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);



        ReportResponse reportResponse;
        try {
            reportResponse = externalReportWSSService.runReport(reportRequest,"");
            String s = new String(reportResponse.getReportBytes());
            Map<String,String> responseMapper = XmlParser.parseXml(s);
            System.out.println(responseMapper);
        } catch (AccessDeniedException_Exception e) {
            e.printStackTrace();
        } catch (InvalidParametersException_Exception e) {
            e.printStackTrace();
        } catch (OperationFailedException_Exception e) {
            e.printStackTrace();
        }

    }
}
