package com.kk.Springbootmanger.service.impl;

import com.kk.Springbootmanger.common.ReturnModel;
import com.kk.Springbootmanger.dao.MessageDao;
import com.kk.Springbootmanger.domain.Message;
import com.kk.Springbootmanger.service.MessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 订单信息
 * Created  by Mr.kk
 * DateTime on 2018-08-23 10:36:51
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Resource
    private MessageDao messageDao;

    /**
     * 新增或修改
     */
    @Override
    public ReturnModel insertOrUpdate(Message message) {
        ReturnModel result = new ReturnModel();
        if (message == null) {
            return result;
        }
        if(null != message.getId() && !"".equals(message.getId())){
            //修改
            result =  update(message);
        }else{ //新增
            result = insert(message);
        }
        return result;
    }

    /**
     * 新增
     */
    @Override
    public ReturnModel insert(Message message) {
        ReturnModel result = new ReturnModel();
        if (message == null) {
            result.addDefaultModel("404","必要参数缺失");
            return result;
        }
        messageDao.insert(message);
        result.setSuccess(true);
        return result;
    }

    /**
     * 删除
     */
    @Override
    public ReturnModel delete(String id) {
        ReturnModel result = new ReturnModel();
        if(null == id || "".equals(id)){
            result.setMsg("id不能为空！");
            return result;
        }
        int ret = messageDao.delete(id);
        if(ret > 0){
            result.setSuccess(true);
            return  result;
        }else{
            return  result;
        }
    }

    /**
     * 修改
     */
    @Override
    public ReturnModel update(Message message) {
        ReturnModel result = new ReturnModel();
        int ret = messageDao.update(message);
        if(ret > 0){
            result.setSuccess(true);
            return  result;
        }else{
            return  result;
        }
    }

    /**
     * 根据Id查询
     */
    @Override
    public ReturnModel load(String id) {
        ReturnModel result = new ReturnModel();
        if(null == id || "".equals(id)){
            result.setMsg("id不能为空！");
            return result;
        }
        Message message = messageDao.load(id);
        result.addDefaultModel("value",message);
        result.setSuccess(true);
        return result;
    }

    /**
     * 全部查询
     */
    public List<Message> getAll(){
        List<Message> list = messageDao.getAll();
        return list;
    };

    /**
     * 分页查询
     */
    @Override
    public Map<String,Object> pageList(int offset, int pagesize) {
        List<Message> pageList = messageDao.pageList(offset, pagesize);
        int totalCount = messageDao.pageListCount(offset, pagesize);
        // 分页查询的数据的返回
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("pageList", pageList);
        result.put("totalCount", totalCount);
        return result;
    }

}
