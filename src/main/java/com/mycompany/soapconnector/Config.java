package com.mycompany.soapconnector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import org.apache.camel.CamelContext;
import org.apache.camel.component.cxf.CxfEndpoint;
import org.apache.camel.component.cxf.DataFormat;
import org.apache.camel.spring.boot.CamelContextConfiguration;
import org.apache.camel.util.jsse.KeyManagersParameters;
import org.apache.camel.util.jsse.KeyStoreParameters;
import org.apache.camel.util.jsse.SSLContextParameters;
import org.apache.camel.util.jsse.TrustManagersParameters;
import org.apache.cxf.feature.LoggingFeature;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.message.Message;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.dom.handler.WSHandlerConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	protected Logger log = LoggerFactory.getLogger(getClass());

	@Bean
	CamelContextConfiguration contextConfiguration() {
		return new CamelContextConfiguration() {
			@Override
			public void beforeApplicationStart(CamelContext context) {

				log.info("################### Before Application Start ############################");
				context.getGlobalOptions().put("http.proxyHost", "ouparray.oup.com");
				context.getGlobalOptions().put("http.proxyPort", "8080");
				context.setUseMDCLogging(true);
//				context.setTracing(true);
//
//				
//				
//				KeyStoreParameters ksp = new KeyStoreParameters();
//				ksp.setResource("C:/Users/dhuaj/Documents/Personal/soapUiPoject/certificates/final/identity.jks");
//				ksp.setPassword("damith");
//
//				KeyManagersParameters kmp = new KeyManagersParameters();
//				kmp.setKeyStore(ksp);
//				kmp.setKeyPassword("damith");
//
//				SSLContextParameters scp = new SSLContextParameters();
//				scp.setKeyManagers(kmp);
//				
//				
//				
//				TrustManagersParameters trustManagersParameters = new TrustManagersParameters();
//				trustManagersParameters.setKeyStore(ksp);
//				
//				scp.setTrustManagers(trustManagersParameters);

//				HttpComponent httpComponent = context.getComponent("http4", HttpComponent.class);
//				httpComponent.setSslContextParameters(scp);

//				Client client = ClientProxy.getClient(8080);
//				HTTPConduit conduit = (HTTPConduit)client.getConduit();
//				TLSClientParameters tlsParams = new TLSClientParameters();
//				tlsParams.setUseHttpsURLConnectionDefaultSslSocketFactory(true);
//				tlsParams.setUseHttpsURLConnectionDefaultHostnameVerifier(true);
//				conduit.setTlsClientParameters(tlsParams);
				
				
				
				
			}

			@Override
			public void afterApplicationStart(CamelContext camelContext) {
				log.info("################### After Application Start  ############################");
			}
		};
	}
	
	 @SuppressWarnings("deprecation")
	@Bean
	    public CxfEndpoint KVKEndpoint() {
	    	
		 
//		 endpointName="s:DataserviceSoap11"
//					id="KVKEndpoint" serviceName="s:DataserviceService"
//					wsdlURL="classpath:wsdl/KVK-KvKDataservice.wsdl"
//					xmlns:s="http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02"
		 
	    	CxfEndpoint cxfEndpoint = new CxfEndpoint();
	    	cxfEndpoint.setWsdlURL("classpath:wsdl/KVK-KvKDataservice.wsdl");
	    	cxfEndpoint.setEndpointName(new QName("http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02", "DataserviceSoap11"));
	    	cxfEndpoint.setServiceName(new QName("http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02", "DataserviceService"));
	    	cxfEndpoint.setDataFormat(DataFormat.PAYLOAD);

	    	
			KeyStoreParameters ksp = new KeyStoreParameters();
			ksp.setResource("/home/ubuntu/cert.pfx");
			ksp.setPassword("damith");

			KeyManagersParameters kmp = new KeyManagersParameters();
			kmp.setKeyStore(ksp);
			kmp.setKeyPassword("damith");

			
			TrustManagersParameters trustManagersParameters = new TrustManagersParameters();
			trustManagersParameters.setTrustManager(new HttpsTrustManager());
			
			
			SSLContextParameters sslContextParameters = new SSLContextParameters();
			sslContextParameters.setKeyManagers(kmp);
			sslContextParameters.setTrustManagers(trustManagersParameters);
	    	
	    	cxfEndpoint.setSslContextParameters(sslContextParameters);
	    	
	    	List<Interceptor<? extends Message>> outInterceptor= new ArrayList<>();
	    	outInterceptor.add(getWss4JOutInterceptor());
	    	
	    	cxfEndpoint.setOutInterceptors(outInterceptor);
	    	cxfEndpoint.setFeatures(
	    	        new ArrayList<>(Arrays.asList(loggingFeature())));
	    	
	    	
	    	return cxfEndpoint;
	    }
	 
//	 @SuppressWarnings("deprecation")
	@Bean
	  public LoggingFeature loggingFeature() {
	    LoggingFeature loggingFeature = new LoggingFeature();
	    loggingFeature.setPrettyLogging(true);

	    return loggingFeature;
	  }
		private static WSS4JOutInterceptor getWss4JOutInterceptor() {
	        final Map<String, Object> outProps = new HashMap<String, Object>();
	
	        // for outgoing messages: Signature and Timestamp validation
	        outProps.put(WSHandlerConstants.ACTION, WSHandlerConstants.SIGNATURE + " " + WSHandlerConstants.TIMESTAMP);
	        outProps.put(WSHandlerConstants.USER, "cert");
	        
	        outProps.put(WSHandlerConstants.PW_CALLBACK_CLASS, ClientKeystorePasswordCallbackHandler.class.getName());
	        outProps.put(WSHandlerConstants.SIG_PROP_FILE, "client_sec.properties");
	        outProps.put(WSHandlerConstants.SIG_KEY_ID, "DirectReference"); // Using "X509KeyIdentifier" is also supported by oppslagstjenesten
	        //outProps.put(WSHandlerConstants.SIG_KEY_ID, "X509KeyIdentifier");
//	        if (signPaaVegneAv) {
//	            outProps.put(WSHandlerConstants.SIGNATURE_PARTS, "{}{}Body;{}{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd}Timestamp};{}{http://kontaktinfo.difi.no/xsd/oppslagstjeneste/16-02}Oppslagstjenesten");
//	        } else {
//	            outProps.put(WSHandlerConstants.SIGNATURE_PARTS, "{}{}Body;{}{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd}Timestamp}");
//	        }
	        outProps.put(WSHandlerConstants.SIGNATURE_PARTS,
	                "{}{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd}Timestamp;" +
	                "{}{http://schemas.xmlsoap.org/soap/envelope/}Body;"+
	                "{}{http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02}ophalenInschrijvingRequest"
	                //"{Element}{http://www.w3.org/2005/08/addressing}Header"
	        		);
	        //outProps.put(WSHandlerConstants.SIG_ALGO, "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256");
	
	        return new WSS4JOutInterceptor(outProps);
	    }

}
