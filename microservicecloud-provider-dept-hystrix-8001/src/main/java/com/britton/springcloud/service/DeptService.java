package com.britton.springcloud.service;

import com.britton.springcloud.entities.Dept;

import java.util.List;

/**
 * Created by ZeroV on 2018/11/6.
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
