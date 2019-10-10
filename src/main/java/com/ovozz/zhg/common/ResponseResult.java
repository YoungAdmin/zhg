package com.ovozz.zhg.common;

import java.io.Serializable;

/**
 * 响应结构体
 */
public class ResponseResult implements Serializable {

    private static final long serialVersionUID = 1L;

    //状态码
    private Integer msgCode;

    //message
    private String message;

    //数据体
    private Object data;

    public ResponseResult() {
    }

    public ResponseResult(Integer msgCode, String message) {
        this.msgCode = msgCode;
        this.message = message;
    }

    /**
     *
     * setResultCode:(解析参数ResultCode).
     * @param code
     */
    public void setResultCode(ResultCode code) {
        this.msgCode = code.msgCode();
        this.message = code.message();
    }

    /**
     *
     * success:(执行成功,无数据返回).
     * @return
     */
    public static  ResponseResult success() {
        ResponseResult result = new ResponseResult();
        result.setResultCode(ResultCode.SUCCESS);
        return result;
    }

    /**
     *
     * success:(执行成功,有数据返回).
     * @param data
     * @return
     */
    public static ResponseResult success(Object data) {
        ResponseResult result = new ResponseResult();
        result.setResultCode(ResultCode.SUCCESS);
        result.setData(data);
        return result;
    }

    /**
     *
     * failure:(执行失败,无数据返回,返回错误信息).
     * @param resultCode
     * @return
     */
    public static  ResponseResult failure(ResultCode resultCode) {
        ResponseResult result = new ResponseResult();
        result.setResultCode(resultCode);
        return result;
    }

    /**
     *
     * failure:(执行失败,有数据返回,返回错误信息).
     * @param resultCode
     * @param data
     * @return
     */
    public static  ResponseResult failure(ResultCode resultCode, Object data) {
        ResponseResult result = new ResponseResult();
        result.setResultCode(resultCode);
        result.setData(data);
        return result;
    }

    /**
     *
     * failure:(系统运行时异常错误).
     * @param msgCode
     * @param data
     * @return
     */
    public static  ResponseResult failure(Integer msgCode,String message, Object data) {
        ResponseResult result = new ResponseResult();
        result.setMsgCode(msgCode);
        result.setMessage(message);
        result.setData(data);
        return result;
    }
    /**
     *
     * failure:(自定义异常).
     * @param message 自定义异常信息
     * @return
     */
    public static  ResponseResult failure(String message) {
        ResponseResult result = new ResponseResult();
        result.setMsgCode(ResultCode.FAILURE.msgCode());
        result.setMessage(message);
        return result;
    }

    /**
     *
     * failure:(自定义异常).
     * @return
     */
    public static  ResponseResult failure() {
        ResponseResult result = new ResponseResult();
        result.setResultCode(ResultCode.FAILURE);
        return result;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getMsgCode() {
        return msgCode;
    }

    public void setMsgCode(Integer msgCode) {
        this.msgCode = msgCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
