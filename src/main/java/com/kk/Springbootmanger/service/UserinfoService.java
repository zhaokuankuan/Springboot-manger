package com.kk.Springbootmanger.service;

import com.kk.Springbootmanger.common.ReturnT;
import com.kk.Springbootmanger.domain.Userinfo;

import java.util.Map;

/**
 * 用户信息
 *
 * Created by xuxueli on '2018-08-16 15:33:05'.
 */
public interface UserinfoService {

    /**
     * 新增
     */
    public ReturnT insert(Userinfo userinfo);

    /**
     * 删除
     */
    public ReturnT delete(int id);

    /**
     * 更新
     */
    public ReturnT update(Userinfo userinfo);

    /**
     * Load查询
     */
    public Userinfo load(int id);

    /**
     * 分页查询
     */
    public Map<String,Object> pageList(int offset, int pagesize);

}
