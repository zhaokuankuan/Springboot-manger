package com.kk.Springbootmanger.controller;

import com.kk.Springbootmanger.common.ReturnT;
import com.kk.Springbootmanger.domain.Userinfo;
import com.kk.Springbootmanger.service.UserinfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 用户信息
 *
 * Created by xuxueli on '2018-08-16 15:33:05'.
 */
@Api(value = "测试生成模板",tags = "生成模板")
@Controller
public class UserinfoController {

    @Resource
    private UserinfoService userinfoService;

    /**
     * 新增
     */
    @ApiOperation(value = "新增",notes = "新增接口")
    @GetMapping("/insert")
    @ResponseBody
    public ReturnT insert(Userinfo userinfo){
        ReturnT stringReturnT = new ReturnT(200,"");
        stringReturnT.setData(userinfo);
        return userinfoService.insert(userinfo);
    }

    /**
     * 删除
     */
    @ApiOperation(value = "删除",notes = "删除接口")
    @GetMapping("/delete")
    @ResponseBody
    public ReturnT delete(int id){
        return userinfoService.delete(id);
    }

    /**
     * 更新
     */
    @ApiOperation(value = "更新",notes = "更新接口")
    @GetMapping("/update")
    @ResponseBody
    public ReturnT update(Userinfo userinfo){
        return userinfoService.update(userinfo);
    }

    /**
     * Load查询
     */
    @ApiOperation(value = "查询",notes = "查询接口")
    @GetMapping("/load")
    @ResponseBody
    public Userinfo load(int id){
        return userinfoService.load(id);
    }

    /**
     * 分页查询
     */
    @ApiOperation(value = "分页查询",notes = "分页查询接口")
    @GetMapping("/pageList")
    @ResponseBody
    public Map<String, Object> pageList(@RequestParam(required = false, defaultValue = "0") int offset,
                                        @RequestParam(required = false, defaultValue = "10") int pagesize) {
        return userinfoService.pageList(offset, pagesize);
    }

}
