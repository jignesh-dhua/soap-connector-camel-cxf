package com.mycompany.soapconnector;

import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.SecureRandom;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ImportResource({ "classpath:spring/camel-context.xml" })
public class Application {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("javax.net.ssl.trustStore", "/home/ubuntu/cert.pfx");
	    System.setProperty("javax.net.ssl.trustStorePassword", "damith");
	    System.setProperty("javax.net.ssl.trustStoreType", "PKCS12");
//
//	    //my certificate and password
//	    //System.setProperty("javax.net.ssl.keyStore", "C:/Users/dhuaj/Documents/Personal/soapUiPoject/certificates/cert.pfx");
//	    //System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");
//	    
	    System.setProperty("javax.net.ssl.keyStore", "/home/ubuntu/cert.pfx");
	    System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");
	    System.setProperty("javax.net.ssl.keyStorePassword", "damith");
		
		
		KeyStore clientStore = KeyStore.getInstance("PKCS12");
		clientStore.load(new FileInputStream(new File("/home/ubuntu/cert.pfx")), "damith".toCharArray());
		KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
		kmf.init(clientStore, "damith".toCharArray());
		KeyManager[] kms = kmf.getKeyManagers();

		// Assuming that you imported the CA Cert "Subject: CN=MBIIS CA, OU=MBIIS,
		// O=DAIMLER, C=DE"
		// to your cacerts Store.
		KeyStore trustStore = KeyStore.getInstance("JKS");
		trustStore.load(new FileInputStream("/home/ubuntu/cert.pfx"), "damith".toCharArray());

		TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
		tmf.init(trustStore);
		TrustManager[] tms = tmf.getTrustManagers();

		final SSLContext sslContext = SSLContext.getInstance("SSLv3");
		//sslContext.init(kms, tms, new SecureRandom());
		sslContext.init(kms, new X509TrustManager[]{new HttpsTrustManager()}, new SecureRandom());
		SSLContext.setDefault(sslContext);


		HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
		HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        });
	    
	    
		SpringApplication.run(Application.class, args);
	}
	
	
	private static WSS4JOutInterceptor getWss4JOutInterceptor(boolean signPaaVegneAv) {
//        final Map<String, Object> outProps = new HashMap<String, Object>();
//
//        // for outgoing messages: Signature and Timestamp validation
//        outProps.put(WSHandlerConstants.ACTION, WSHandlerConstants.SIGNATURE + " " + WSHandlerConstants.TIMESTAMP);
//        outProps.put(WSHandlerConstants.USER, "client_alias");
//        outProps.put(WSHandlerConstants.PW_CALLBACK_CLASS, ClientKeystorePasswordCallbackHandler.class.getName());
//        outProps.put(WSHandlerConstants.SIG_PROP_FILE, "client_sec.properties");
//        outProps.put(WSHandlerConstants.SIG_KEY_ID, "DirectReference"); // Using "X509KeyIdentifier" is also supported by oppslagstjenesten
//        if (signPaaVegneAv) {
//            outProps.put(WSHandlerConstants.SIGNATURE_PARTS, "{}{}Body;{}{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd}Timestamp};{}{http://kontaktinfo.difi.no/xsd/oppslagstjeneste/16-02}Oppslagstjenesten");
//        } else {
//            outProps.put(WSHandlerConstants.SIGNATURE_PARTS, "{}{}Body;{}{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd}Timestamp}");
//        }
//        outProps.put(WSHandlerConstants.SIG_ALGO, "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256");
//
//        return new WSS4JOutInterceptor(outProps);
		return null;
    }
}