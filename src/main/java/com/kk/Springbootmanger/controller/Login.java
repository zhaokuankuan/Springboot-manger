package com.kk.Springbootmanger.controller;

import com.kk.Springbootmanger.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author :Mr.kk
 * @date: 2018/8/14-13:59
 * 登陆的接口
 */
@Api(value = "用户登陆和登出的类",tags={"用户接口"})
@RestController
public class Login {

    private  static  final Log  log = LogFactory.getLog(Login.class);

    @GetMapping("/log/in")
    @ApiOperation(value = "登陆的接口",notes = "传入用户的账户和密码进行登陆")
    public  Object logIn(User user, HttpServletRequest request, HttpServletResponse response){
       Map<String,Object> map = new HashMap<String,Object>();
        if(user.getUserName()!= null  && user.getPassWord()!= null){
            map.put("name",user.getUserName());
            map.put("pwd",user.getPassWord());
            map.put("status","ok");
            HttpSession session = request.getSession();
            session.setAttribute("user",map);
            session.setMaxInactiveInterval(60*15);
        }else{
            map.put("message","login faliure!");
            map.put("status","bad");
        }
        return map;
    }

    @GetMapping("log/out")
    @ApiOperation(value = "登出的接口",notes = "进行当前用户的注销")
    public Object logOut(HttpServletRequest request,HttpServletResponse response){
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        session.invalidate();//清除 session 中的所有信息
        return "登出成功！";
    }
}
