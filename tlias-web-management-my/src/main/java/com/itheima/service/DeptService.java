package com.itheima.service;

import com.itheima.pojo.Dept;

import java.util.List;

/**
 * 部门管理
 */
public interface DeptService {
    /**
     * 查询全部部门数据
     * @return
     * */
    List<Dept> list();

    /**
     * 删除方法
     * */
    void delete(Integer id) throws Exception;

    /**
     * 新增部门
     * */
    void add(Dept dept);


    /**
     * 根据部门查询id
     *
     * @return*/
    Dept search(Integer id);

    void edit(Dept dept);
}
