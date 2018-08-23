package com.kk.Springbootmanger.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.core.annotation.Order;

import java.util.List;

/**
 * 订单信息
 * Created  by Mr.kk
 * DateTime on 2018-08-22 15:37:33
 */
public interface OrderDao {

    /**
     * 新增
     */
    public int insert(@Param("order") Order order);

    /**
     * 删除
     */
    public int delete(@Param("id") int id);

    /**
     * 更新
     */
    public int update(@Param("order") Order order);

    /**
     * Load查询
     */
    public Order load(@Param("id") int id);

    /**
     * Load查询
     */
    public List<Order> getAll();


    /**
     * 分页查询Data
     */
    public List<Order> pageList(@Param("offset") int offset,
                                @Param("pagesize") int pagesize);

    /**
     * 分页查询Count
     */
    public int pageListCount(@Param("offset") int offset,
                             @Param("pagesize") int pagesize);

}

