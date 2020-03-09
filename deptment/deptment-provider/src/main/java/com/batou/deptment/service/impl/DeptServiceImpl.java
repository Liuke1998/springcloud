package com.batou.deptment.service.impl;

import com.batou.deptment.mapper.DeptMapper;
import com.batou.deptment.service.DeptService;
import com.batou.deptment.entity.DeptEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public DeptEntity get(Long id) {
        return deptMapper.get(id);
    }

    @Override
    public List<DeptEntity> list() {
        return deptMapper.list();
    }
}
