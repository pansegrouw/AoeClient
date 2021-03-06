
package au.com.alliedexpress.neptune.ttws_ejb;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pans.ApplicationLauncher;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TnTWebService", targetNamespace = "http://neptune.alliedexpress.com.au/ttws-ejb", wsdlLocation = "http://triton.alliedexpress.com.au:8080/ttws-ejb/TTWS?wsdl")
public class TnTWebService
    extends Service
{
    static Logger LOG = LoggerFactory.getLogger(TnTWebService.class);
    private final static URL TNTWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException TNTWEBSERVICE_EXCEPTION;
    private final static QName TNTWEBSERVICE_QNAME = new QName("http://neptune.alliedexpress.com.au/ttws-ejb", "TnTWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            String wsdlUrl = "http://"+ApplicationLauncher.HOST+".alliedexpress.com.au:8080/ttws-ejb/TTWS?wsdl";
            LOG.debug("using URL [{}]" ,wsdlUrl );
            url = new URL(wsdlUrl);
            
            LOG.info("Testing connection");
            URL clone_url = new URL(url.toString());
            HttpURLConnection clone_urlconnection = (HttpURLConnection) clone_url.openConnection();
            // TimeOut settings
            clone_urlconnection.setConnectTimeout(10000);
            clone_urlconnection.setReadTimeout(10000);
            clone_urlconnection.connect();
            LOG.info("Connection is fine");
            
            //url = new URL("http://neptune.alliedexpress.com.au:8080/ttws-ejb/TTWS?wsdl");
        } catch (IOException ex) {
//            LOG.error(ex.getMessage() , ex);
            e = new WebServiceException(ex);
        }
        TNTWEBSERVICE_WSDL_LOCATION = url;
        TNTWEBSERVICE_EXCEPTION = e;
    }

    public TnTWebService() {
        super(__getWsdlLocation(), TNTWEBSERVICE_QNAME);
        LOG.debug("wdsl location [{}]" , __getWsdlLocation().toString());
        LOG.debug("TNTWEBSERVICE_QNAME [{}]" , TNTWEBSERVICE_QNAME.toString());
    }

    public TnTWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TNTWEBSERVICE_QNAME, features);
    }

    public TnTWebService(URL wsdlLocation) {
        super(wsdlLocation, TNTWEBSERVICE_QNAME);
    }

    public TnTWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TNTWEBSERVICE_QNAME, features);
    }

    public TnTWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TnTWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
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
