package com.kk.Springbootmanger.dao;

import com.kk.Springbootmanger.domain.OrderTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单信息
 * Created  by Mr.kk
 * DateTime on 2018-08-22 16:19:57
 */
public interface OrderTableDao {

    /**
     * 新增
     */
    public int insert(@Param("orderTable") OrderTable orderTable);

    /**
     * 删除
     */
    public int delete(@Param("id") int id);

    /**
     * 更新
     */
    public int update(@Param("orderTable") OrderTable orderTable);

    /**
     * Load查询
     */
    public OrderTable load(@Param("id") int id);

    /**
     * Load查询
     */
    public List<OrderTable> getAll();


    /**
     * 分页查询Data
     */
    public List<OrderTable> pageList(@Param("offset") int offset,
                                     @Param("pagesize") int pagesize);

    /**
     * 分页查询Count
     */
    public int pageListCount(@Param("offset") int offset,
                             @Param("pagesize") int pagesize);

}
