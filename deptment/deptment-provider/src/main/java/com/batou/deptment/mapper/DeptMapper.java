package com.batou.deptment.mapper;

import com.batou.deptment.entity.DeptEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {

    DeptEntity get(Long id);

    List<DeptEntity> list();
}
