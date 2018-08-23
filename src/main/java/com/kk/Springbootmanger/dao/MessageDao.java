package com.kk.Springbootmanger.dao;

import com.kk.Springbootmanger.domain.Message;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单信息
 * Created  by Mr.kk
 * DateTime on 2018-08-23 10:36:51
 */
public interface MessageDao {

    /**
     * 新增
     */
    public int insert(@Param("message") Message message);

    /**
     * 删除
     */
    public int delete(@Param("id") String id);

    /**
     * 更新
     */
    public int update(@Param("message") Message message);

    /**
     * Load查询
     */
    public Message load(@Param("id") String id);

    /**
     * Load查询
     */
    public List<Message> getAll();


    /**
     * 分页查询Data
     */
    public List<Message> pageList(@Param("offset") int offset,
                                  @Param("pagesize") int pagesize);

    /**
     * 分页查询Count
     */
    public int pageListCount(@Param("offset") int offset,
                             @Param("pagesize") int pagesize);

}
