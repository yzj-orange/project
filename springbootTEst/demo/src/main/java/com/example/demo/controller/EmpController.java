package com.example.demo.controller;


import com.example.demo.entity.Emp;
import com.example.demo.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author astupidcoder
 * @since 2021-08-22
 */
@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private IEmpService empSer;

    @RequestMapping("/getData")
    public List<Emp> getData(){
        return empSer.list();
    }
}
