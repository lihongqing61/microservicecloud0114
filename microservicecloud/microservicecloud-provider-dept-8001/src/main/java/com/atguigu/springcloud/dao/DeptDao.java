package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;


/**
 * 1. 为了把mapper这个DAO交給Spring管理
 * 2. 为了不再写mapper映射文件(可以写注解)
 * 3. 为了给mapper接口 自动根据一个添加@Mapper注解的接口生成一个实现类
 *
 * 需要注意的是：这个接口中不可以定义同名的方法，因为会生成相同的id
 *  * 也就是说这个接口是不支持重载的
 */
// @Mapper
public interface DeptDao {

    public List<Dept> findAll();

    public Dept findById(Long id);

    public boolean addDept(Dept dept);
}
