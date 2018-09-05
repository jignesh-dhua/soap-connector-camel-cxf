package com.mycompany.soapconnector;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class RestApi extends RouteBuilder{

	@Override
    public void configure() {
		
//        restConfiguration()
//            .contextPath("/").apiContextPath("/api-doc")
//                .apiProperty("api.title", "Billing Script API")
//                .apiProperty("api.version", "1.0")
//                .apiProperty("cors", "true")
//                .apiContextRouteId("billing-script-api")
//            .bindingMode(RestBindingMode.json);
//
//        rest("/").description("Billing Script REST service")
//            .get("/generatefile").description("Generate File for specific date and sequence number")
//                .route().routeId("GenerateFileApi")
//                .log("Request reached :: Date: ${header.date} , Sequence No: ${header.sequenceNo}")
//                .to("direct:generateFile")
//                .process("apiSuccessResponse")
//                .endRest();
    }
}