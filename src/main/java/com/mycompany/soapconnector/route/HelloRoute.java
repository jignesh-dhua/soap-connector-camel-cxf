package com.mycompany.soapconnector.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.cxf.binding.soap.SoapFault;
import org.springframework.stereotype.Component;

@Component
public class HelloRoute  extends RouteBuilder{

	String request1= "<ns:ophalenInschrijvingRequest xmlns:ns=\"http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02\">\n" + 
			"         <ns:klantreferentie>SoapUI-TEST</ns:klantreferentie>\n" + 
			"         <ns:rsin>992353427</ns:rsin>\n" + 
			"      </ns:ophalenInschrijvingRequest>";
	
	String request2= "<ophalenInschrijvingRequest>\n" + 
			"         <klantreferentie>SoapUI-TEST</klantreferentie>\n" + 
			"         <rsin>992353427</rsin>\n" + 
			"      </ophalenInschrijvingRequest>";
	
	@Override
	public void configure() throws Exception {
		
		onException(SoapFault.class)
			.log("Soap Fault")
			.log("Body :: ${body}");
		
		
		from("timer:test?repeatCount=1")
			.log("Hello World")
			//.setBody(constant("resource:classpath:/soap/soap-request.xml"))
			
			.setBody(constant(request2))
					
			.log("SOAP Request :: ${body}")

			
			.setHeader("Accept-Encoding", constant("gzip,deflate"))
			.setHeader("Content-Type", constant("text/xml;charset=UTF-8"))
			.setHeader("SOAPAction", constant("http://es.kvk.nl/ophalenInschrijving"))
			.setHeader("Host", constant("webservices.preprod.kvk.nl"))
			.setHeader("Connection", constant("Keep-Alive"))
			
			.to("cxf:bean:KVKEndpoint")
//		
//			.toD("https4://webservices.preprod.kvk.nl/postbus2")
			
			.log("Response: ${body}");

	}
}