package com.kk.Springbootmanger.controller;

import com.kk.Springbootmanger.dao.UserDao;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author :zhaokk
 * @date: 2018/8/13 - 16:27
 */
@RestController
@Api(value = "测试的demo",tags = {"搭建环境的测试代码"})
public class DemoController {

    @Autowired
    private UserDao userDao;

    @ApiOperation(value = "测试restful",notes = "测试工程")
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(String name){
        return name;
    }

    @ApiOperation(value = "测试数据库连通性",notes = "测试数据库连通性")
    @RequestMapping(value = "/getAll",method = {RequestMethod.GET,RequestMethod.POST})
    public Object getAll(){
        return userDao.getAll();
    }
}
