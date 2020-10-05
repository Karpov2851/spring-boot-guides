package com.ws.util;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import com.sun.org.apache.xerces.internal.dom.DeferredTextImpl;
import org.apache.tomcat.util.codec.binary.Base64;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.xml.XMLConstants;
import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

/**
 * Created by vikas on 07-05-2019.
 */


public class XmlParser {

    public static Map<String,String> parseXml(String xml){
        Map<String,String> mapper = new HashMap<>();
        try{
            DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            InputSource is = new InputSource();
            is.setCharacterStream(new StringReader(xml));

            Document doc = db.parse(is);
            NodeList nodes = doc.getElementsByTagName("G_1");
            for (int i = 0; i < nodes.getLength(); i++) {
                Element element = (Element) nodes.item(i);

                NodeList name = element.getElementsByTagName("EMP_NUM");
                Element line = (Element) name.item(0);
                mapper.put("employeeNum",getCharacterDataFromElement(line));

            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return mapper;
    }

    public static String getCharacterDataFromElement(Element e) {
        Node child = e.getFirstChild();
        if (child instanceof CharacterData) {
            CharacterData cd = (CharacterData) child;
            return cd.getData();
        }
        return "";
    }

    public static void main(String[] args) {
        String sxml = "<env:Envelope xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\"><env:Header/><env:Body><ns2:runReportResponse xmlns:ns2=\"http://xmlns.oracle.com/oxp/service/PublicReportService\"><ns2:runReportReturn><ns2:reportBytes>PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz4KPCEtLUdlbmVyYXRlZCBieSBP\n" +
                "cmFjbGUgQkkgUHVibGlzaGVyIC1EYXRhZW5naW5lLCBkYXRhbW9kZWw6X0N1c3RvbV9NUExfSW50\n" +
                "ZWdyYXRpb25zX1JpcHBsZUhpcmVfTVBMX1JIX1JFSElSRV9DSEVDS19ETV94ZG0gLS0+CjxEQVRB\n" +
                "X0RTPjxHXzE+CjxFTVBfTlVNPjIzMDk1OTk8L0VNUF9OVU0+PEVNUF9MRVZFTD42PC9FTVBfTEVW\n" +
                "RUw+PEVNUF9UWVBFPkVNUDwvRU1QX1RZUEU+PFRFUl9EQVRFPjIwMTktMDMtMTk8L1RFUl9EQVRF\n" +
                "PjxSRUhJUkVfUkVDT00+Tm90IFNwZWNpZmllZDwvUkVISVJFX1JFQ09NPjxMQVNUX0NUQz40ODM3\n" +
                "MzguNzU8L0xBU1RfQ1RDPjxDVVJSRU5DWT5JTlI8L0NVUlJFTkNZPgo8L0dfMT4KPC9EQVRBX0RT\n" +
                "Pg==</ns2:reportBytes><ns2:reportContentType>text/xml</ns2:reportContentType><ns2:reportFileID xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:nil=\"true\"/><ns2:reportLocale xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:nil=\"true\"/><ns2:metaDataList xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:nil=\"true\"/></ns2:runReportReturn></ns2:runReportResponse></env:Body></env:Envelope>";

        String xml = "<soapenv:Envelope "
                + "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" "
                + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" "
                + "xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" "
                + "xmlns:ser=\"http://services.web.post.list.com\"><soapenv:Header>"
                + "<authInfo xsi:type=\"soap:authentication\" "
                + "xmlns:soap=\"http://list.com/services/SoapRequestProcessor\">"
                + "<username xsi:type=\"xsd:string\">asdf@g.com</username>"
                + "<password xsi:type=\"xsd:string\">asdf</password></authInfo></soapenv:Header></soapenv:Envelope>";

        try {
            DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
            domFactory.setNamespaceAware(true);
            DocumentBuilder builder = domFactory.newDocumentBuilder();
            Document doc = builder.parse(new InputSource(new StringReader(sxml)));
            XPath xpath = XPathFactory.newInstance().newXPath();
            xpath.setNamespaceContext(new NamespaceContext() {

                @Override
                public Iterator getPrefixes(String arg0) {
                    return null;
                }

                @Override
                public String getPrefix(String arg0) {
                    return null;
                }

                @Override
                public String getNamespaceURI(String arg0) {
                    if ("env".equals(arg0)) {
                        return "http://www.w3.org/2003/05/soap-envelope";
                    }else if("ns2".equals(arg0)){
                        return "http://xmlns.oracle.com/oxp/service/PublicReportService";

                    }
                    return null;
                }
            });
//            XPathExpression expr = xpath
//                    .compile("/env:Envelope/env:Body/ns2:runReportResponse/ns2:runReportReturn/ns2:reportBytes");
            XPathExpression expr = xpath
                    .compile("/env:Envelope/env:Body/ns2:runReportResponse/ns2:runReportReturn/ns2:reportBytes/text()");
            Object result = expr.evaluate(doc, XPathConstants.NODESET);
            NodeList nodes = (NodeList) result;
            for(int i =0;i<nodes.getLength();i++){
                Node nNode = nodes.item(i);
                System.out.println(((DeferredTextImpl) nNode).getData());

                byte[] valueDecoded= Base64.decodeBase64(((DeferredTextImpl) nNode).getData().getBytes());
                String responseXml = new String(valueDecoded);
                System.out.println(responseXml);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }


    }

    }



