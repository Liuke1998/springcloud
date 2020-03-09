package com.batou.deptment.service;

import com.batou.deptment.entity.DeptEntity;

import java.util.List;

public interface DeptService {

    DeptEntity get(Long id);

    List<DeptEntity> list();

}
