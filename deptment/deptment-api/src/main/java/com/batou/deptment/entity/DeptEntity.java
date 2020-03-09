package com.batou.deptment.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class DeptEntity implements Serializable {

    private Long id;

    private String name;
}
