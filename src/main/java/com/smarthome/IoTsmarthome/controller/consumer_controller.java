package com.smarthome.IoTsmarthome.controller;

import com.smarthome.IoTsmarthome.repo.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class consumer_controller {

    @Autowired
    private ConsumerRepository consumerRepository;

    //Link for actually just listing all consumers. Will be replaced by consumers eventually.
//    @RequestMapping("/findall")
//    public String findAll() {
//        String result = "";
//        int i = 0;
//
////        for(consumers f : consumerRepository.findAll()){
////            result =+ i + " + "
////        }
////    }
}
