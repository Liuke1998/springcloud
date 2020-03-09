package com.batou.deptment.controller;

import com.batou.deptment.entity.DeptEntity;
import com.batou.deptment.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "dept/get/{id}",method = RequestMethod.GET)
    public DeptEntity get(@PathVariable Long id){
        return deptService.get(id);
    }

    @RequestMapping(value = "dept/list",method = RequestMethod.GET)
    public List<DeptEntity> list(){
        return deptService.list();
    }
}
