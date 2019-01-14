package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;
import java.util.List;

public interface DeptService {

    public List<Dept> findAll();

    public Dept findById(Long id);

    public boolean addDept(Dept dept);
}
