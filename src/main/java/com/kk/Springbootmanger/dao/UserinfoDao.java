package com.kk.Springbootmanger.dao;

import com.kk.Springbootmanger.domain.Userinfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户信息
 *
 * Created by xuxueli on '2018-08-16 15:33:05'.
 */
public interface UserinfoDao {

    /**
     * 新增
     */
    public int insert(@Param("userinfo") Userinfo userinfo);

    /**
     * 删除
     */
    public int delete(@Param("id") int id);

    /**
     * 更新
     */
    public int update(@Param("userinfo") Userinfo userinfo);

    /**
     * Load查询
     */
    public Userinfo load(@Param("id") int id);

    /**
     * 分页查询Data
     */
    public List<Userinfo> pageList(@Param("offset") int offset,
                                   @Param("pagesize") int pagesize);

    /**
     * 分页查询Count
     */
    public int pageListCount(@Param("offset") int offset,
                             @Param("pagesize") int pagesize);

}

