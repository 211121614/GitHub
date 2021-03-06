package com.computerstore.factories.components;

/**
 * Created by Aidem on 2016/04/17.
 */

import com.computerstore.domain.components.OpticalDevices;
import java.util.UUID;

public class OpticalDevicesFactory {

    public static OpticalDevices createOpticalDevices(String productNumber,int stock, String description,double price) {
        OpticalDevices  cpu = new OpticalDevices
                .Builder()
                .id(UUID.randomUUID().toString())
                .productNumber(productNumber)
                .stock(stock)
                .description(description)
                .price(price)
                .build();
        return cpu;
    }

}
