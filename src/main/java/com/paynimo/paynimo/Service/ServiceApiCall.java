package com.paynimo.paynimo.Service;

import com.paynimo.paynimo.RequestModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@Service
public class ServiceApiCall {

    public HashMap apiRegistrationServiceCall()
    {

    String paynimoUrl="https://www.paynimo.com/api/paynimoV2.req";

    RestTemplate restTemplate=new RestTemplate();

    RequestModel requestModel=new RequestModel();
    RequestModel.Merchant merchant=new RequestModel.Merchant();
    RequestModel.Payment payment=new RequestModel.Payment();
    RequestModel.Payment.Instruction instruction= new RequestModel.Payment.Instruction();
    RequestModel.Transaction transaction=new RequestModel.Transaction();
    RequestModel.Consumer consumer =new RequestModel.Consumer();

    HashMap<String,String> statusDetail = new HashMap<>();

try {


    merchant.setIdentifier("L3348");
    payment.setInstruction(instruction);

    transaction.setDeviceIdentifier("S");
    transaction.setIdentifier("1516163889655");
    transaction.setCurrency("INR");
    transaction.setType("002");
    transaction.setDateTime("17-01-2018");
    transaction.setRequestType("TSI");
    transaction.setSubType("002");

    consumer.setIdentifier("c90001008");

    requestModel.setMerchant(merchant);
    requestModel.setPayment(payment);
    requestModel.setTransaction(transaction);
    requestModel.setConsumer(consumer);

    statusDetail = restTemplate.postForObject(paynimoUrl, requestModel, HashMap.class);

    if(statusDetail!=null)
    {
        statusDetail.put("msg","Detail found successfully");
        statusDetail.put("code","0000");

    }
    else
    {
        if(statusDetail!=null)
        {
            statusDetail.put("msg","Paynimo api having issue");
            statusDetail.put("code","1111");

        }
    }
}
catch (Exception e)
{
    System.out.println(e);
}
    return statusDetail;
}
}
