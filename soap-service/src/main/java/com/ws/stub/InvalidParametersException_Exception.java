
package com.ws.stub;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.18
 * 2019-05-07T11:46:52.190+05:30
 * Generated source version: 2.7.18
 */

@WebFault(name = "InvalidParametersException", targetNamespace = "http://xmlns.oracle.com/oxp/service/PublicReportService")
public class InvalidParametersException_Exception extends Exception {
    
    private com.ws.stub.InvalidParametersException invalidParametersException;

    public InvalidParametersException_Exception() {
        super();
    }
    
    public InvalidParametersException_Exception(String message) {
        super(message);
    }
    
    public InvalidParametersException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidParametersException_Exception(String message, com.ws.stub.InvalidParametersException invalidParametersException) {
        super(message);
        this.invalidParametersException = invalidParametersException;
    }

    public InvalidParametersException_Exception(String message, com.ws.stub.InvalidParametersException invalidParametersException, Throwable cause) {
        super(message, cause);
        this.invalidParametersException = invalidParametersException;
    }

    public com.ws.stub.InvalidParametersException getFaultInfo() {
        return this.invalidParametersException;
    }
}