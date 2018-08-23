package com.kk.Springbootmanger.service.impl;

import com.kk.Springbootmanger.common.ReturnT;
import com.kk.Springbootmanger.dao.UserinfoDao;
import com.kk.Springbootmanger.domain.Userinfo;
import com.kk.Springbootmanger.service.UserinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户信息
 *
 * Created by xuxueli on '2018-08-16 15:33:05'.
 */
@Service
public class UserinfoServiceImpl implements UserinfoService {

    @Resource
    private UserinfoDao userinfoDao;

    /**
     * 新增
     */
    @Override
    public ReturnT insert(Userinfo userinfo) {
        ReturnT returnT = new ReturnT();
        // valid
        if (userinfo == null) {
            return returnT;
        }
        returnT.setSuccess(true);
        userinfoDao.insert(userinfo);
        return returnT;
    }

    /**
     * 删除
     */
    @Override
    public ReturnT delete(int id) {
        ReturnT returnT = new ReturnT();
        int ret = userinfoDao.delete(id);
        if(ret>0){
            returnT.setSuccess(true);
        }
        return returnT;
    }

    /**
     * 更新
     */
    @Override
    public ReturnT update(Userinfo userinfo) {
        ReturnT returnT = new ReturnT();
        int ret = userinfoDao.update(userinfo);
        if(ret>0){
            returnT.setSuccess(true);
        }
        return returnT;
    }

    /**
     * Load查询
     */
    @Override
    public Userinfo load(int id) {
        return userinfoDao.load(id);
    }

    /**
     * 分页查询
     */
    @Override
    public Map<String,Object> pageList(int offset, int pagesize) {
        List<Userinfo> pageList = userinfoDao.pageList(offset, pagesize);
        int totalCount = userinfoDao.pageListCount(offset, pagesize);
        // result
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("pageList", pageList);
        result.put("totalCount", totalCount);
        return result;
    }

}
