package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/add")
    public boolean addDept(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }


    @GetMapping("/findById/{id}")
    public Dept findById(@PathVariable Long id) {
        return deptService.findById(id);
    }


    @GetMapping("/list")
    public List<Dept> findAll() {
        return deptService.findAll();
    }
}
