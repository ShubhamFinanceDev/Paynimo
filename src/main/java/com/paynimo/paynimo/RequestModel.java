package com.paynimo.paynimo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jdk8.IntStreamSerializer;
import jdk.jfr.DataAmount;
import lombok.Data;

import java.io.Serializable;

@Data
public class RequestModel {
    private Merchant merchant;
    private Payment payment;
    private Transaction transaction;
    private Consumer consumer;

    @Data
 public static class Merchant
 {
     private  String identifier;

 }
@Data
 public  static class Payment
 {
     private Instruction instruction;

@JsonSerialize
public  static class Instruction
     {

     }
 }
@Data
    public  static class Transaction
    {
        private String deviceIdentifier;
        private String  type;
        private String  currency;
        private String  identifier;
        private String dateTime;
        private String subType;
        private String requestType;
    }
    @Data
    public static class Consumer
    {
        private String   identifier;

    }

}
