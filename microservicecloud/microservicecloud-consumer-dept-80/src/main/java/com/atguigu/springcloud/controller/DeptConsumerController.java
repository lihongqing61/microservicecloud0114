package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/add")
    public boolean addDept(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @GetMapping("/findById/{id}")
    public Dept findById(@PathVariable Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX+ "/dept/findById/"+id, Dept.class);
    }


    @GetMapping("/list")
    public List<Dept> findAll() {
        return restTemplate.getForObject(REST_URL_PREFIX+ "/dept/list", List.class);
    }
}
