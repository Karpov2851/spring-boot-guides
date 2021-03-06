
package com.ws.stub;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2019-05-07T11:46:52.166+05:30
 * Generated source version: 2.7.18
 * 
 */
public final class ExternalReportWSSService_ExternalReportWSSService_Client {

    private static final QName SERVICE_NAME = new QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "ExternalReportWSSService");

    private ExternalReportWSSService_ExternalReportWSSService_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ExternalReportWSSService_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ExternalReportWSSService_Service ss = new ExternalReportWSSService_Service(wsdlURL, SERVICE_NAME);
        ExternalReportWSSService port = ss.getExternalReportWSSService();  
        
        {
        System.out.println("Invoking updateTemplateForReport...");
        java.lang.String _updateTemplateForReport_reportAbsolutePath = "";
        java.lang.String _updateTemplateForReport_templateName = "";
        java.lang.String _updateTemplateForReport_locale = "";
        byte[] _updateTemplateForReport_templateData = new byte[0];
        try {
            boolean _updateTemplateForReport__return = port.updateTemplateForReport(_updateTemplateForReport_reportAbsolutePath, _updateTemplateForReport_templateName, _updateTemplateForReport_locale, _updateTemplateForReport_templateData);
            System.out.println("updateTemplateForReport.result=" + _updateTemplateForReport__return);

        } catch (AccessDeniedException_Exception e) { 
            System.out.println("Expected exception: AccessDeniedException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidParametersException_Exception e) { 
            System.out.println("Expected exception: InvalidParametersException has occurred.");
            System.out.println(e.toString());
        } catch (OperationFailedException_Exception e) { 
            System.out.println("Expected exception: OperationFailedException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getReportSampleData...");
        java.lang.String _getReportSampleData_reportAbsolutePath = "";
        try {
            byte[] _getReportSampleData__return = port.getReportSampleData(_getReportSampleData_reportAbsolutePath);
            System.out.println("getReportSampleData.result=" + _getReportSampleData__return);

        } catch (AccessDeniedException_Exception e) { 
            System.out.println("Expected exception: AccessDeniedException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidParametersException_Exception e) { 
            System.out.println("Expected exception: InvalidParametersException has occurred.");
            System.out.println(e.toString());
        } catch (OperationFailedException_Exception e) { 
            System.out.println("Expected exception: OperationFailedException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking uploadReportObject...");
        java.lang.String _uploadReportObject_reportObjectAbsolutePathURL = "";
        java.lang.String _uploadReportObject_objectType = "";
        byte[] _uploadReportObject_objectZippedData = new byte[0];
        try {
            java.lang.String _uploadReportObject__return = port.uploadReportObject(_uploadReportObject_reportObjectAbsolutePathURL, _uploadReportObject_objectType, _uploadReportObject_objectZippedData);
            System.out.println("uploadReportObject.result=" + _uploadReportObject__return);

        } catch (AccessDeniedException_Exception e) { 
            System.out.println("Expected exception: AccessDeniedException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidParametersException_Exception e) { 
            System.out.println("Expected exception: InvalidParametersException has occurred.");
            System.out.println(e.toString());
        } catch (OperationFailedException_Exception e) { 
            System.out.println("Expected exception: OperationFailedException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking updateReportDefinition...");
        java.lang.String _updateReportDefinition_reportAbsPath = "";
        com.ws.stub.ReportDefinition _updateReportDefinition_newReportDefn = null;
        try {
            boolean _updateReportDefinition__return = port.updateReportDefinition(_updateReportDefinition_reportAbsPath, _updateReportDefinition_newReportDefn);
            System.out.println("updateReportDefinition.result=" + _updateReportDefinition__return);

        } catch (AccessDeniedException_Exception e) { 
            System.out.println("Expected exception: AccessDeniedException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidParametersException_Exception e) { 
            System.out.println("Expected exception: InvalidParametersException has occurred.");
            System.out.println(e.toString());
        } catch (OperationFailedException_Exception e) { 
            System.out.println("Expected exception: OperationFailedException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking isFolderExist...");
        java.lang.String _isFolderExist_folderAbsolutePath = "";
        try {
            boolean _isFolderExist__return = port.isFolderExist(_isFolderExist_folderAbsolutePath);
            System.out.println("isFolderExist.result=" + _isFolderExist__return);

        } catch (AccessDeniedException_Exception e) { 
            System.out.println("Expected exception: AccessDeniedException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getSecurityModel...");
        java.lang.String _getSecurityModel__return = port.getSecurityModel();
        System.out.println("getSecurityModel.result=" + _getSecurityModel__return);


        }
        {
        System.out.println("Invoking getReportParameters...");
        com.ws.stub.ReportRequest _getReportParameters_reportRequest = null;
        try {
            com.ws.stub.ParamNameValues _getReportParameters__return = port.getReportParameters(_getReportParameters_reportRequest);
            System.out.println("getReportParameters.result=" + _getReportParameters__return);

        } catch (AccessDeniedException_Exception e) { 
            System.out.println("Expected exception: AccessDeniedException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidParametersException_Exception e) { 
            System.out.println("Expected exception: InvalidParametersException has occurred.");
            System.out.println(e.toString());
        } catch (OperationFailedException_Exception e) { 
            System.out.println("Expected exception: OperationFailedException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking uploadTemplateForReport...");
        java.lang.String _uploadTemplateForReport_reportAbsolutePath = "";
        java.lang.String _uploadTemplateForReport_templateName = "";
        java.lang.String _uploadTemplateForReport_templateType = "";
        java.lang.String _uploadTemplateForReport_locale = "";
        byte[] _uploadTemplateForReport_templateData = new byte[0];
        try {
            boolean _uploadTemplateForReport__return = port.uploadTemplateForReport(_uploadTemplateForReport_reportAbsolutePath, _uploadTemplateForReport_templateName, _uploadTemplateForReport_templateType, _uploadTemplateForReport_locale, _uploadTemplateForReport_templateData);
            System.out.println("uploadTemplateForReport.result=" + _uploadTemplateForReport__return);

        } catch (AccessDeniedException_Exception e) { 
            System.out.println("Expected exception: AccessDeniedException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidParametersException_Exception e) { 
            System.out.println("Expected exception: InvalidParametersException has occurred.");
            System.out.println(e.toString());
        } catch (OperationFailedException_Exception e) { 
            System.out.println("Expected exception: OperationFailedException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking hasReportAccess...");
        java.lang.String _hasReportAccess_reportAbsolutePath = "";
        try {
            boolean _hasReportAccess__return = port.hasReportAccess(_hasReportAccess_reportAbsolutePath);
            System.out.println("hasReportAccess.result=" + _hasReportAccess__return);

        } catch (InvalidParametersException_Exception e) { 
            System.out.println("Expected exception: InvalidParametersException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getXDOSchema...");
        java.lang.String _getXDOSchema_reportAbsolutePath = "";
        java.lang.String _getXDOSchema_locale = "";
        try {
            byte[] _getXDOSchema__return = port.getXDOSchema(_getXDOSchema_reportAbsolutePath, _getXDOSchema_locale);
            System.out.println("getXDOSchema.result=" + _getXDOSchema__return);

        } catch (AccessDeniedException_Exception e) { 
            System.out.println("Expected exception: AccessDeniedException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidParametersException_Exception e) { 
            System.out.println("Expected exception: InvalidParametersException has occurred.");
            System.out.println(e.toString());
        } catch (OperationFailedException_Exception e) { 
            System.out.println("Expected exception: OperationFailedException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getBIPHTTPSessionInterval...");
        int _getBIPHTTPSessionInterval__return = port.getBIPHTTPSessionInterval();
        System.out.println("getBIPHTTPSessionInterval.result=" + _getBIPHTTPSessionInterval__return);


        }
        {
        System.out.println("Invoking createReportFolder...");
        java.lang.String _createReportFolder_folderAbsolutePath = "";
        try {
            java.lang.String _createReportFolder__return = port.createReportFolder(_createReportFolder_folderAbsolutePath);
            System.out.println("createReportFolder.result=" + _createReportFolder__return);

        } catch (AccessDeniedException_Exception e) { 
            System.out.println("Expected exception: AccessDeniedException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidParametersException_Exception e) { 
            System.out.println("Expected exception: InvalidParametersException has occurred.");
            System.out.println(e.toString());
        } catch (OperationFailedException_Exception e) { 
            System.out.println("Expected exception: OperationFailedException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking removeTemplateForReport...");
        java.lang.String _removeTemplateForReport_reportAbsolutePath = "";
        java.lang.String _removeTemplateForReport_templateFileName = "";
        try {
            boolean _removeTemplateForReport__return = port.removeTemplateForReport(_removeTemplateForReport_reportAbsolutePath, _removeTemplateForReport_templateFileName);
            System.out.println("removeTemplateForReport.result=" + _removeTemplateForReport__return);

        } catch (AccessDeniedException_Exception e) { 
            System.out.println("Expected exception: AccessDeniedException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidParametersException_Exception e) { 
            System.out.println("Expected exception: InvalidParametersException has occurred.");
            System.out.println(e.toString());
        } catch (OperationFailedException_Exception e) { 
            System.out.println("Expected exception: OperationFailedException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking uploadReportDataChunk...");
        java.lang.String _uploadReportDataChunk_fileID = "";
        byte[] _uploadReportDataChunk_reportDataChunk = new byte[0];
        java.lang.String _uploadReportDataChunk_reportRawDataChunk = "";
        try {
            java.lang.String _uploadReportDataChunk__return = port.uploadReportDataChunk(_uploadReportDataChunk_fileID, _uploadReportDataChunk_reportDataChunk, _uploadReportDataChunk_reportRawDataChunk);
            System.out.println("uploadReportDataChunk.result=" + _uploadReportDataChunk__return);

        } catch (OperationFailedException_Exception e) { 
            System.out.println("Expected exception: OperationFailedException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getTemplate...");
        java.lang.String _getTemplate_reportAbsolutePath = "";
        java.lang.String _getTemplate_templateID = "";
        java.lang.String _getTemplate_locale = "";
        try {
            byte[] _getTemplate__return = port.getTemplate(_getTemplate_reportAbsolutePath, _getTemplate_templateID, _getTemplate_locale);
            System.out.println("getTemplate.result=" + _getTemplate__return);

        } catch (AccessDeniedException_Exception e) { 
            System.out.println("Expected exception: AccessDeniedException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidParametersException_Exception e) { 
            System.out.println("Expected exception: InvalidParametersException has occurred.");
            System.out.println(e.toString());
        } catch (OperationFailedException_Exception e) { 
            System.out.println("Expected exception: OperationFailedException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking runReport...");
        com.ws.stub.ReportRequest _runReport_reportRequest = null;
        java.lang.String _runReport_appParams = "";
        try {
            com.ws.stub.ReportResponse _runReport__return = port.runReport(_runReport_reportRequest, _runReport_appParams);
            System.out.println("runReport.result=" + _runReport__return);

        } catch (AccessDeniedException_Exception e) { 
            System.out.println("Expected exception: AccessDeniedException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidParametersException_Exception e) { 
            System.out.println("Expected exception: InvalidParametersException has occurred.");
            System.out.println(e.toString());
        } catch (OperationFailedException_Exception e) { 
            System.out.println("Expected exception: OperationFailedException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking validateLogin...");
        boolean _validateLogin__return = port.validateLogin();
        System.out.println("validateLogin.result=" + _validateLogin__return);


        }
        {
        System.out.println("Invoking submitReport...");
        byte[] _submitReport_submitReportData = new byte[0];
        java.lang.String _submitReport_appParams = "";
        try {
            java.lang.String _submitReport__return = port.submitReport(_submitReport_submitReportData, _submitReport_appParams);
            System.out.println("submitReport.result=" + _submitReport__return);

        } catch (AccessDeniedException_Exception e) { 
            System.out.println("Expected exception: AccessDeniedException has occurred.");
            System.out.println(e.toString());
        } catch (SchedulingException_Exception e) { 
            System.out.println("Expected exception: SchedulingException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking downloadReportDataChunk...");
        java.lang.String _downloadReportDataChunk_fileID = "";
        long _downloadReportDataChunk_beginIdx = 0;
        int _downloadReportDataChunk_size = 0;
        try {
            com.ws.stub.ReportDataChunk _downloadReportDataChunk__return = port.downloadReportDataChunk(_downloadReportDataChunk_fileID, _downloadReportDataChunk_beginIdx, _downloadReportDataChunk_size);
            System.out.println("downloadReportDataChunk.result=" + _downloadReportDataChunk__return);

        } catch (OperationFailedException_Exception e) { 
            System.out.println("Expected exception: OperationFailedException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getReportDefinition...");
        java.lang.String _getReportDefinition_reportAbsolutePath = "";
        try {
            com.ws.stub.ReportDefinition _getReportDefinition__return = port.getReportDefinition(_getReportDefinition_reportAbsolutePath);
            System.out.println("getReportDefinition.result=" + _getReportDefinition__return);

        } catch (AccessDeniedException_Exception e) { 
            System.out.println("Expected exception: AccessDeniedException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidParametersException_Exception e) { 
            System.out.println("Expected exception: InvalidParametersException has occurred.");
            System.out.println(e.toString());
        } catch (OperationFailedException_Exception e) { 
            System.out.println("Expected exception: OperationFailedException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking createReport...");
        java.lang.String _createReport_reportName = "";
        java.lang.String _createReport_folderAbsolutePathURL = "";
        java.lang.String _createReport_templateFileName = "";
        byte[] _createReport_templateData = new byte[0];
        java.lang.String _createReport_xliffFileName = "";
        byte[] _createReport_xliffData = new byte[0];
        boolean _createReport_updateFlag = false;
        try {
            java.lang.String _createReport__return = port.createReport(_createReport_reportName, _createReport_folderAbsolutePathURL, _createReport_templateFileName, _createReport_templateData, _createReport_xliffFileName, _createReport_xliffData, _createReport_updateFlag);
            System.out.println("createReport.result=" + _createReport__return);

        } catch (AccessDeniedException_Exception e) { 
            System.out.println("Expected exception: AccessDeniedException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidParametersException_Exception e) { 
            System.out.println("Expected exception: InvalidParametersException has occurred.");
            System.out.println(e.toString());
        } catch (OperationFailedException_Exception e) { 
            System.out.println("Expected exception: OperationFailedException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking deleteReport...");
        java.lang.String _deleteReport_reportAbsolutePath = "";
        try {
            boolean _deleteReport__return = port.deleteReport(_deleteReport_reportAbsolutePath);
            System.out.println("deleteReport.result=" + _deleteReport__return);

        } catch (AccessDeniedException_Exception e) { 
            System.out.println("Expected exception: AccessDeniedException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidParametersException_Exception e) { 
            System.out.println("Expected exception: InvalidParametersException has occurred.");
            System.out.println(e.toString());
        } catch (OperationFailedException_Exception e) { 
            System.out.println("Expected exception: OperationFailedException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getTemplateParameters...");
        java.lang.String _getTemplateParameters_reportAbsolutePath = "";
        java.lang.String _getTemplateParameters_templateID = "";
        try {
            java.util.List<com.ws.stub.ParamNameValue> _getTemplateParameters__return = port.getTemplateParameters(_getTemplateParameters_reportAbsolutePath, _getTemplateParameters_templateID);
            System.out.println("getTemplateParameters.result=" + _getTemplateParameters__return);

        } catch (AccessDeniedException_Exception e) { 
            System.out.println("Expected exception: AccessDeniedException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidParametersException_Exception e) { 
            System.out.println("Expected exception: InvalidParametersException has occurred.");
            System.out.println(e.toString());
        } catch (OperationFailedException_Exception e) { 
            System.out.println("Expected exception: OperationFailedException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getFolderContents...");
        java.lang.String _getFolderContents_folderAbsolutePath = "";
        try {
            com.ws.stub.CatalogContents _getFolderContents__return = port.getFolderContents(_getFolderContents_folderAbsolutePath);
            System.out.println("getFolderContents.result=" + _getFolderContents__return);

        } catch (AccessDeniedException_Exception e) { 
            System.out.println("Expected exception: AccessDeniedException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidParametersException_Exception e) { 
            System.out.println("Expected exception: InvalidParametersException has occurred.");
            System.out.println(e.toString());
        } catch (OperationFailedException_Exception e) { 
            System.out.println("Expected exception: OperationFailedException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getDeliveryServiceDefinition...");
        try {
            com.ws.stub.DeliveryServiceDefinition _getDeliveryServiceDefinition__return = port.getDeliveryServiceDefinition();
            System.out.println("getDeliveryServiceDefinition.result=" + _getDeliveryServiceDefinition__return);

        } catch (AccessDeniedException_Exception e) { 
            System.out.println("Expected exception: AccessDeniedException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking isReportExist...");
        java.lang.String _isReportExist_reportAbsolutePath = "";
        try {
            boolean _isReportExist__return = port.isReportExist(_isReportExist_reportAbsolutePath);
            System.out.println("isReportExist.result=" + _isReportExist__return);

        } catch (AccessDeniedException_Exception e) { 
            System.out.println("Expected exception: AccessDeniedException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking downloadReportObject...");
        java.lang.String _downloadReportObject_reportAbsolutePath = "";
        try {
            byte[] _downloadReportObject__return = port.downloadReportObject(_downloadReportObject_reportAbsolutePath);
            System.out.println("downloadReportObject.result=" + _downloadReportObject__return);

        } catch (AccessDeniedException_Exception e) { 
            System.out.println("Expected exception: AccessDeniedException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidParametersException_Exception e) { 
            System.out.println("Expected exception: InvalidParametersException has occurred.");
            System.out.println(e.toString());
        } catch (OperationFailedException_Exception e) { 
            System.out.println("Expected exception: OperationFailedException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking deleteFolder...");
        java.lang.String _deleteFolder_folderAbsolutePath = "";
        try {
            boolean _deleteFolder__return = port.deleteFolder(_deleteFolder_folderAbsolutePath);
            System.out.println("deleteFolder.result=" + _deleteFolder__return);

        } catch (AccessDeniedException_Exception e) { 
            System.out.println("Expected exception: AccessDeniedException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidParametersException_Exception e) { 
            System.out.println("Expected exception: InvalidParametersException has occurred.");
            System.out.println(e.toString());
        } catch (OperationFailedException_Exception e) { 
            System.out.println("Expected exception: OperationFailedException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking deliveryService...");
        com.ws.stub.DeliveryRequest _deliveryService_deliveryRequest = null;
        try {
            java.lang.String _deliveryService__return = port.deliveryService(_deliveryService_deliveryRequest);
            System.out.println("deliveryService.result=" + _deliveryService__return);

        } catch (AccessDeniedException_Exception e) { 
            System.out.println("Expected exception: AccessDeniedException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidParametersException_Exception e) { 
            System.out.println("Expected exception: InvalidParametersException has occurred.");
            System.out.println(e.toString());
        } catch (OperationFailedException_Exception e) { 
            System.out.println("Expected exception: OperationFailedException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
