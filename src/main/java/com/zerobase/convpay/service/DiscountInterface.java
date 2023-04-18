package com.zerobase.convpay.service;

import com.zerobase.convpay.dto.PayRequest;
import org.springframework.stereotype.Component;


public interface DiscountInterface {
    Integer getDiscountedAmount(PayRequest payRequest);


}
