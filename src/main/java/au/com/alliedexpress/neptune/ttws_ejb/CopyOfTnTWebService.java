
package au.com.alliedexpress.neptune.ttws_ejb;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

import com.pans.ApplicationLauncher;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TnTWebService", targetNamespace = "http://neptune.alliedexpress.com.au/ttws-ejb", wsdlLocation = "http://triton.alliedexpress.com.au:8080/ttws-ejb/TTWS?wsdl")
public class CopyOfTnTWebService
    extends Service
{

    private final static URL TNTWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException TNTWEBSERVICE_EXCEPTION;
    private final static QName TNTWEBSERVICE_QNAME;

//    http://neptune.alliedexpress.com.au:8080/ttws-ejb/TTWS?wsdl
//    {http://neptune.alliedexpress.com.au/ttws-ejb}TnTWebService
    
    static {
        URL url = null;
        WebServiceException e = null;
        TNTWEBSERVICE_QNAME = new QName("http://"+ApplicationLauncher.HOST+".alliedexpress.com.au/ttws-ejb", "TnTWebService");
        try {
            url = new URL("http://"+ApplicationLauncher.HOST+".alliedexpress.com.au:8080/ttws-ejb/TTWS?wsdl");
            //url = new URL("http://neptune.alliedexpress.com.au:8080/ttws-ejb/TTWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
           // TNTWEBSERVICE_QNAME = null;
        }
        TNTWEBSERVICE_WSDL_LOCATION = url;
        TNTWEBSERVICE_EXCEPTION = e;
        
    }

    public CopyOfTnTWebService() {
        super(__getWsdlLocation(), TNTWEBSERVICE_QNAME);
        System.out.println(__getWsdlLocation());
        System.out.println(TNTWEBSERVICE_QNAME);
    }

    public CopyOfTnTWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TNTWEBSERVICE_QNAME, features);
    }

    public CopyOfTnTWebService(URL wsdlLocation) {
        super(wsdlLocation, TNTWEBSERVICE_QNAME);
    }

    public CopyOfTnTWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TNTWEBSERVICE_QNAME, features);
    }

    public CopyOfTnTWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CopyOfTnTWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TTWS
     */
    @WebEndpoint(name = "TTWSPort")
    public TTWS getTTWSPort() {
        return super.getPort(new QName("http://neptune.alliedexpress.com.au/ttws-ejb", "TTWSPort"), TTWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TTWS
     */
    @WebEndpoint(name = "TTWSPort")
    public TTWS getTTWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://neptune.alliedexpress.com.au/ttws-ejb", "TTWSPort"), TTWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TNTWEBSERVICE_EXCEPTION!= null) {
            throw TNTWEBSERVICE_EXCEPTION;
        }
        return TNTWEBSERVICE_WSDL_LOCATION;
    }

}
