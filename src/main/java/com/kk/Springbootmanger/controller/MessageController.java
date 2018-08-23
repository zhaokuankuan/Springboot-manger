package com.kk.Springbootmanger.controller;

import com.kk.Springbootmanger.common.ReturnModel;
import com.kk.Springbootmanger.domain.Message;
import com.kk.Springbootmanger.service.MessageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 订单信息
 * Created  by Mr.kk
 * DateTime on 2018-08-23 10:36:51
 */
@Api(value = "Message",tags = {"消息"})
@RestController
public class MessageController {

    @Resource
    private MessageService messageService;

    /**
     * 新增或修改
     */
    @ApiOperation(value = "insertOrUpdate",notes = "新增或修改")
    @RequestMapping(value="/message/insertOrUpdate",method = {RequestMethod.GET,RequestMethod.POST})
    public ReturnModel insertOrUpdate(Message message){
        if(null == message){
            message = new Message();
        }
        return messageService.insertOrUpdate(message);
    }

    /**
     * 新增
     */
    @ApiOperation(value = "insert",notes = "新增")
    @RequestMapping(value="/message/insert",method = {RequestMethod.GET,RequestMethod.POST})
    public ReturnModel insert(Message message){
        return messageService.insert(message);
    }

    /**
     * 删除
     */
    @ApiOperation(value = "delete",notes = "删除")
    @RequestMapping(value="/message/delete",method = {RequestMethod.GET,RequestMethod.POST})
    public ReturnModel delete(String id){
        return messageService.delete(id);
    }

    /**
     * 修改
     */
    @ApiOperation(value = "update",notes = "修改")
    @RequestMapping(value="/message/update",method = {RequestMethod.GET,RequestMethod.POST})
    public ReturnModel update(Message message){
        return messageService.update(message);
    }

    /**
     * 根据Id查询
     */
    @ApiOperation(value = "getById",notes = "根据Id查询")
    @RequestMapping(value="/message/getById",method = {RequestMethod.GET,RequestMethod.POST})
    public ReturnModel load(String id){
        return messageService.load(id);
    }

    /**
     * 全部查询
     */
    @ApiOperation(value = "getAll",notes = "全部查询")
    @RequestMapping(value="/message/getAll",method = {RequestMethod.GET,RequestMethod.POST})
    public List<Message> getAll(){
        return messageService.getAll();
    }

    /**
     * 分页查询
     */
    @ApiOperation(value = "getByPageList",notes = "分页查询")
    @RequestMapping(value="/message/getByPageList",method = {RequestMethod.GET,RequestMethod.POST})
    public Map<String, Object> pageList(@RequestParam(required = false, defaultValue = "0") int offset,
                                        @RequestParam(required = false, defaultValue = "10") int pagesize) {
        return messageService.pageList(offset, pagesize);
    }

}
