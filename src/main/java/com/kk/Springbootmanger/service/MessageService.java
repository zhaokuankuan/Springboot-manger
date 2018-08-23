package com.kk.Springbootmanger.service;

import com.kk.Springbootmanger.common.ReturnModel;
import com.kk.Springbootmanger.domain.Message;

import java.util.List;
import java.util.Map;

/**
 * 订单信息
 * Created  by Mr.kk
 * DateTime on 2018-08-23 10:36:51
 */
public interface MessageService {

    /**
     * 新增或修改
     */
    public ReturnModel insertOrUpdate(Message message);

    /**
     * 新增
     */
    public ReturnModel insert(Message message);

    /**
     * 删除
     */
    public ReturnModel delete(String id);

    /**
     * 更新
     */
    public ReturnModel update(Message message);

    /**
     * 根据Id查询
     */
    public ReturnModel load(String id);

    /**
     * 全部查询
     */
    public List<Message> getAll();

    /**
     * 分页查询
     */
    public Map<String,Object> pageList(int offset, int pagesize);

}
