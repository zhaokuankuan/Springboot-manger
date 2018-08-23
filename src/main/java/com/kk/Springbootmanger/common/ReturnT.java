package com.kk.Springbootmanger.common;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * common return
 * @author xuxueli 2015-12-4 16:32:31
 */
public class ReturnT implements Serializable {

    public static final long serialVersionUID = 1L;
    private Map<String, Object> result = new HashMap();
    private int code;
    private String msg;
    private Object data;
    private boolean success;

    public ReturnT(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public ReturnT() {
        this.success = false;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public Object addDefaultModel(String key, Object obj) {
        return this.result.put(key, obj);
    }
    public Map<String, Object> getMap() {
        return this.result;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}
