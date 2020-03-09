package com.batou.deptment.controller;

import com.batou.deptment.entity.DeptEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DeptMentController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "consumer/dept/get/{id}",method = RequestMethod.GET)
    public DeptEntity get(@PathVariable Long id){
        return restTemplate.getForObject("http://DEPTMENT-PROVIDER/dept/get/{1}",DeptEntity.class,id);
    }
}
