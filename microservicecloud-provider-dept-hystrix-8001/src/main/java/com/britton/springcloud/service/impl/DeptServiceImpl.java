package com.britton.springcloud.service.impl;

import com.britton.springcloud.dao.DeptDao;
import com.britton.springcloud.entities.Dept;
import com.britton.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZeroV on 2018/11/6.
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao dao;


    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }

}
