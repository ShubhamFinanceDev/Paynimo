package com.paynimo.paynimo.PaynimoController;

import com.paynimo.paynimo.RequestModel;
import com.paynimo.paynimo.Service.ServiceApiCall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@RestController
public class PaynimoController {

@Autowired
private ServiceApiCall serviceApiCall;

    @PostMapping("/registrationStatus")
    public HashMap callStatusApi()
    {
//        String paynimoUrl="https://www.paynimo.com/api/paynimoV2.req";
//
//        RestTemplate restTemplate=new RestTemplate();
//
//        RequestModel requestModel=new RequestModel();
//        RequestModel.Merchant merchant=new RequestModel.Merchant();
//        RequestModel.Payment payment=new RequestModel.Payment();
//        RequestModel.Payment.Instruction instruction= new RequestModel.Payment.Instruction();
//        RequestModel.Transaction transaction=new RequestModel.Transaction();
//        RequestModel.Consumer consumer =new RequestModel.Consumer();
//
//
//
//        merchant.setIdentifier("L3348");
//        payment.setInstruction(instruction);
//
//        transaction.setDeviceIdentifier("S");
//        transaction.setIdentifier("1516163889655");
//        transaction.setCurrency("INR");
//        transaction.setType("002");
//        transaction.setDateTime("17-01-2018");
//        transaction.setRequestType("TSI");
//        transaction.setSubType("002");
//
//        consumer.setIdentifier("c90001008");
//
//        requestModel.setMerchant(merchant);
//        requestModel.setPayment(payment);
//        requestModel.setTransaction(transaction);
//        requestModel.setConsumer(consumer);
//        HashMap<String,String> statusDetail = restTemplate.postForObject(paynimoUrl,requestModel,HashMap.class);
//
////      System.out.println( map);

        HashMap statusDetail=serviceApiCall.apiRegistrationServiceCall();

        return statusDetail;
    }
}
