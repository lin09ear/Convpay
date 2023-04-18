package com.zerobase.convpay.service;

import com.zerobase.convpay.dto.PayRequest;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



public class DiscountByConvenience implements DiscountInterface{


    @Override
    public Integer getDiscountedAmount(PayRequest payRequest) {
        switch (payRequest.getConvenienceType()) {

            case G25:
                return payRequest.getPayAmount() * 8 / 10;
            case GU:
                return payRequest.getPayAmount() * 9 / 10;
            case SEVEN:
                return payRequest.getPayAmount();
        }
        return null;
    }
}
