package com.itheima.controller;

import com.itheima.anno.Log;
import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 部门管理Controller
 */
@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController {

    //注入
    @Autowired
    private DeptService deptService ;

    //定义日志记录对象
    //private static Logger log = LoggerFactory.getLogger(DeptController.class) ;
    //简化定义 加注解 @Slf4j

    //@RequestMapping(value = "/depts",method = RequestMethod.GET)//请求方式指定为GET
    //注解优化
    /**
     * 查询部门数据*/
    @GetMapping
    public Result list(){
        log.info("查询全部部门数据");

        //调用serviece查询部门对象
        List<Dept> deptList = deptService.list();

        return Result.success(deptList) ;
    }

    /**
     * 删除部门
     * */
    @Log
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) throws Exception {
        log.info("根据id删除部门:{}",id);
        //调用service来删除部门
        deptService.delete(id);
        return Result.success();
    }

    /**
     * 新增部门
     * */
    @Log
    @PostMapping
    public Result add(@RequestBody Dept dept){
        log.info("新增部门:{}",dept);
        //调用service方法新增部门
        deptService.add(dept);
        return Result.success();
    }

    /**
     * 根据ID查询
     * */
    @GetMapping("/{id}")
    public Result search(@PathVariable Integer id){
        log.info("获取id为"+id+"的数据");
        Dept dept = deptService.search(id);
        return Result.success(dept);
    }
    @PutMapping
    public Result edit(@RequestBody Dept dept){
        deptService.edit(dept);
        return Result.success();
    }



}
